<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
    var products = new Array();
</script>
<script src="/js/paypal-button-minicart.js"></script>
<div id="pp" hidden="hidden">
</div>
<script>
    PAYPAL.apps.MiniCart.render({paypalURL: "https://www.sandbox.paypal.com/cgi-bin/webscr", parent:$('#pp').get(0)});
    PAYPAL.apps.MiniCart.reset();
</script>
<div class="container">
    <h1>Cart</h1>
    <br/>
    <div class="row">
        <div class="span2" style="text-align: center">
            <h5>Image</h5>
        </div>
        <div class="span6" style="text-align: center">
            <h5>Name</h5>
        </div>
        <div class="span1" style="text-align: center">
            <h5>Quantity</h5>
        </div>
        <div class="span2" style="text-align: center">
            <h5>Subtotal</h5>
        </div>
    </div>

    <c:if test="${empty fulfillments}">
        <h4 style="text-align: center;">Your cart is currently empty.</h4>
    </c:if>

    <c:forEach var="fulfillment" items="${fulfillments}">
        <div class="row">
            <div class="span2" style="text-align: center">
                <img src="/img/placeholder.jpg" width="70%" height="70%" style="max-height: 240; max-width: 300;" />
            </div>
            <div class="span6" style="text-align: center">
                ${fulfillment.product.name}
            </div>
            <div class="span1" style="text-align: center">
                <select id="qty${fulfillment.id}" style="width: 60px; ">
                    <option value="1" ${fulfillment.quantity == 1 ? 'selected' : ''}>1</option>
                    <option value="2" ${fulfillment.quantity == 2 ? 'selected' : ''}>2</option>
                    <option value="3" ${fulfillment.quantity == 3 ? 'selected' : ''}>3</option>
                    <option value="4" ${fulfillment.quantity == 4 ? 'selected' : ''}>4</option>
                </select>
            </div>
            <div class="span2" style="text-align: center">
                $<c:out value="${fulfillment.quantity * fulfillment.product.price}" />
            </div>
            <div class="span" style="text-align: center">
                <i class="icon-remove" data-toggle="tooltip" data-placement="top"
                        data-original-title="Remove from cart" style="cursor:pointer" onclick="remove_from_cart(${fulfillment.id})"></i>
            </div>


        </div>
        <hr />
        <script type="text/javascript">
            products.push({id: ${fulfillment.id}, quantity: "${fulfillment.quantity}", name: "${fulfillment.product.name}", amount: "${fulfillment.product.price}"});
        </script>
    </c:forEach>
    <c:if test="${not empty fulfillments}">
        <button onclick="check_out();" class="btn btn-success pull-right">Checkout</button>
    </c:if>
    <br />
    <br />
    <br />
    <div style="font-size: 12px">
        Samples are included with every order; if you'd prefer a certain scent, please note it in the Paypal transaction and we'll do our best to accomodate you.
        <br />
        For sanitation reasons, returns are not accepted.
        <br />
        At this time, only domestic (USA) orders are accepted. Tracking numbers will be emailed upon shipping.
        <br />
        Orders over $50 will require a signature at time of delivery.
    </div>

</div> <!-- /container -->

<div id="modal" class="modal hide fade">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h3>Large Order</h3>
    </div>
    <div class="modal-body">
        <p>Right now, your cart contains 30 or more bars of soap. This means that you qualify for a bulk-order discount. Please contact us for more information!</p>
    </div>
    <div class="modal-footer">
        <a href="#" class="btn btn-primary">Okay</a>
    </div>
</div>

<script type="text/javascript">
    jQuery('.icon-remove').tooltip();
    jQuery('#header-cart').addClass('active');
    $('select').change(function(){
        var id = this.id.replace('qty', '');
        var qty = this.value;
        $.ajax({
            url: '/cart/'+id+'?qty='+qty,
            type: 'PUT',
            contentType: 'application/json',
            processData: false,
            success: function(data){
                console.log(data.data + 'was updated in the cart');
                location.reload();
            }
        });
    });

    function remove_from_cart(id){
        $.ajax({
            url: '/cart/'+id,
            type: 'DELETE',
            contentType: 'application/json',
            processData: false,
            success: function(data, status){
                console.log('An item was removed from the cart');
                location.reload();
            }

        });
    }

    function check_out(){
        PAYPAL.apps.MiniCart.reset();
        //check that the total number of products ordered is <30
        for(prod in products)
            tot += products[prod].quantity;
        if(tot >= 30){
            $('#modal').modal('show');
            return;
        }

        for(prod in products){
            data = {
                add: "true",
                amount: products[prod].amount,
                item_name: products[prod].name,
                quantity: products[prod].quantity,
                business: "tracyshandmadesoap-facilitator@gmail.com",
                cmd: "_cart",
                env: "sandbox"
            };

            console.log(PAYPAL.apps.MiniCart.addToCart(data));

        }
        $('div form').submit();
    }
</script>



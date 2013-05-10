<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h1 style="color: purple">The Finer Things</h1>
    <br/>
    <p>
        Looking for an all-natural distraction that won't break the bank? Look no further than Simple Pleasures. Every soap listed here is handmade from (INGREDIENTS)
        with care and is priced for the cost-conscious consumer.
    </p>
    <br />
    <c:forEach var="product" items="${products}">
        <div class="container">
            <hr />
            <h4><c:out value="${product.name}" /></h4>
            <span class="pull-left" style="margin-top: 5px; width: 25%;">
                <img src="/img/placeholder.jpg" />
            </span>
            <span class="pull-left" style="margin-top: 5px; width: 60%;">

                <p>&nbsp; &nbsp; &nbsp; &nbsp;<c:out value="${product.description}" /></p>
            </span>
            <span class="pull-right">
                <div>
                    <select id="qty${product.id}" style="width: 60px; margin-top: 5px;">
                        <option></option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                    </select>
                    at
                    <b>$<c:out value="${product.price.toPlainString()}" /></b>
                    each
                </div>
                <button data-placement="right" data-content="Please select a quantity"
                        onclick='add_to_cart(${product.id});'
                        class="btn pull-right" type="button" id="btn${product.id}">
                    Add to Cart
                </button>
            </span>
        </div>

    </c:forEach>
</div> <!-- /container -->
<script type="text/javascript">
    jQuery('#header-soap').addClass('active');
    function add_to_cart(id){
        var qty = $('#qty'+id).val();
        if(qty== ""){ // the user didn't specify a quantity
            $('#btn'+id).popover('show');
        }
        else{
            $('#btn'+id).popover('hide');
            $.ajax({
                url: '/cart/add/'+id+"?qty="+qty,
                type: 'POST',
                contentType: 'application/json',
                processData: false,
                success: function(data, status){
                    console.log(JSON.stringify(data.product) + ' was added to the cart');
                }
            });
        }
    }
</script>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar" />
                <span class="icon-bar" />
                <span class="icon-bar" />
            </button>
            <a class="brand" href="/">Tracy's Handmade Soap</a>
            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li id="header-home"><a href="/">Home</a></li>

                    <li id="header-soap" class="dropdown">
                        <!-- we don't want to drop the soap, haha -->
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">The Soap</a>
                        <ul class="dropdown-menu">
                            <li><a href="/lines/simple">Simple Pleasures &raquo;</a></li>
                            <li><a href="/lines/eco">Eco &raquo;</a></li>
                            <li><a href="/lines/finer">The Finer Things &raquo;</a></li>
                        </ul>
                    </li>
                    <li id="header-about"><a href="/about">About</a></li>
                    <li id="header-contact"><a href="/contact">Contact</a></li>
                </ul>
                <ul class="nav pull-right">

                    <li id="header-cart"><a href="/cart" style="text-decoration: underline !important;">Your Cart &raquo;</a></li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
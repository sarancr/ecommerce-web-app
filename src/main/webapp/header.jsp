	<div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">
                        <ul>
                            <li><a href="orderhistory"><i class="fa fa-user"></i> My Account</a></li>
                            <li><a href="wishlist"><i class="fa fa-heart"></i> Wishlist</a></li>
                        </ul>
                    </div>
                </div>
                
      			<c:if test="${not empty user}">
                <div class="col-md-4">
                    <div class="header-right">
                    <div class="user-menu">	
                        <ul>
                            <li><a href="index.jsp"><i class="fa fa-user"></i> Hello, <c:out value="${user.firstname}"/></a></li>
                            <li><a href="logout"><i class="fa fa-user"></i> Logout</a></li>
                        </ul>
                    </div>
                    </div>
                </div>
               </c:if>
            </div>
        </div>
    </div> <!-- End header area -->
    
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <h1><a href="index.jsp">e<span>Electronics</span></a></h1>
                    </div>
                </div>
                
                <div class="col-sm-6">
                    <div class="shopping-item">
                        <a href="cart">Cart - <span class="cart-amunt" id="min-cart-amount">$0</span> <i class="fa fa-shopping-cart"></i>
                         <span class="cart-amunt" name="cart_product_count" id="min-cart-count">0</span></a>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End site branding area -->
    
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.jsp">Home</a></li>
                        <li><a href="allproducts">Shop All</a></li>
                        <li><a href="cart">Cart</a></li>
                        <li><a href="checkout">Checkout</a></li>
                        <li><a href="orderhistory">Order History</a></li>
                        <li><a href="contact.jsp">Contact</a></li>
                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
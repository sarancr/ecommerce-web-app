<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
  <head>
   <%@ include file="pagelinks.jsp" %>
  </head>
  <body>
   
   <%@ include file="header.jsp" %>
    
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2><c:out value="${sessionScope.user.firstname}"/>'s wish list</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <c:if test="${empty requestScope.wishItems}">
					<div> Your wish list is empty. Please add products from Shop All page.</div>
				</c:if>
				<c:forEach var="wishItem" items="${requestScope.wishItems}">
					 <div class="col-md-3 col-sm-6">
						<div class="single-shop-product">
	                        <div class="product-upper">
	                            <img src="${wishItem.product.imgUrl}" alt="">
	                        </div>
	                        <h2><a href="productdetail?productId=${wishItem.product.productId}"><c:out value="${wishItem.product.name}"/></a></h2>
	                        <div class="product-carousel-price">
	                            <ins><c:out value="${wishItem.product.price}"/></ins> <del><c:out value="${wishItem.product.listprice}"/></del>
	                        </div>  
	                        
	                        <div class="product-option-shop" style="display:inline">
	                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" 
	                               data-product_id="{product.productId}" rel="nofollow" href="addtocart?productId=<c:out value='${wishItem.product.productId}'/>&qty=1">Add to cart</a>
	                        </div>  
	                             
	                    </div>
	                  </div>
				 </c:forEach>
			  </div>
            </div>
      </div>
 
	<%@ include file="footer.jsp" %>
  </body>
</html>
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
                        <h2>Shop All</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <c:if test="${empty requestScope.products}">
					<div> No products found.</div>
				</c:if>
				<c:forEach var="product" items="${requestScope.products}">
					 <div class="col-md-3 col-sm-6">
						<div class="single-shop-product">
	                        <div class="product-upper">
	                            <img src="${product.imgUrl}" alt="">
	                        </div>
	                        <h2><a href="productdetail?productId=${product.productId}"><c:out value="${product.name}"/></a></h2>
	                        <div class="product-carousel-price">
	                            <ins><c:out value="${product.price}"/></ins> <del><c:out value="${product.listprice}"/></del>
	                        </div>  
	                        
	                        <div class="product-option-shop" style="display:inline">
	                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" 
	                               data-product_id="{product.productId}" rel="nofollow" href="addtocart?productId=<c:out value='${product.productId}'/>&qty=1">Add to cart</a>
	                        </div>  
	                        <a href="addwishitem?productId=<c:out value="${product.productId}"/>&jsp=shopall">
	                         <span class="fa fa-heart" style="margin-left:20px;" title="Click to add into wish list"></span>
	                        </a>
	   						               
	                    </div>
	                  </div>
				 </c:forEach>
			  </div>
            </div>
      </div>
 
	<%@ include file="footer.jsp" %>
  </body>
</html>
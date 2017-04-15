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
                        <h2>Order History</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
					<%@ include file="sidebar.jsp" %>
                </div>
                
                <div class="col-md-8">
                    <div class="product-content-right">
                      <c:if test="${not empty requestScope.orders}">
                       <c:forEach var="order" items="${orders}">
						 <div class="woocommerce">
						 	<h2>Order# <c:out value="${order.orderId}"/></h2>
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">&nbsp;</th>
                                            <th class="product-thumbnail">&nbsp;</th>
                                            <th class="product-name">Product</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Quantity</th>
                                            <th class="product-subtotal">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="line" items="${order.orderlines}">
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                1
                                            </td>

                                            <td class="product-thumbnail">
                                                <a href="single-product.html"><img width="145" height="145" alt="poster_1_up" 
                                                    class="shop_thumbnail" src="${line.product.imgUrl}"></a>
                                            </td>

                                            <td class="product-name">
                                                <a href="single-product.html"><c:out value="${line.product.name}"/></a> 
                                            </td>

                                            <td class="product-price">
                                                <span class="amount"><c:out value="${line.orderlinePrice}"/></span> 
                                            </td>

                                            <td class="product-quantity">
                                               <span class="amount"><c:out value="${line.qty}"/></span> 
                                            </td>

                                            <td class="product-subtotal">
                                                <span class="amount"><c:out value="${line.orderlineTotalPrice}"/></span> 
                                            </td>
                                        </tr>
                                    </c:forEach>
                                        <tr>
                                            <td class="actions" colspan="3">
                                                <div class="coupon">
                                                	<span style="font-weight: bold">Coupon Code:</span>
                                                    <input disabled="disabled" type="text"  value="${order.couponCode}" id="coupon_code" class="input-text" name="coupon_code">
                                                </div>
                                            </td>
                                            <td class="actions" colspan="3">
                                                <div class="coupon">
                                                 	<span style="font-weight: bold">Status:</span>
                                                	<span><c:out value="${order.status}"/></span>
                                                </div>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>

                            <div class="cart-collaterals">
                            <div class="cart_totals ">
                                <h2>Order Totals</h2>`
                                <table cellspacing="0">
                                    <tbody>
                                        <tr class="cart-subtotal">
                                            <th>Order Subtotal</th>
                                            <td><span class="amount"><c:out value="${order.total}"/></span></td>
                                        </tr>

                                        <tr class="shipping">
                                            <th>Shipping and Handling</th>
                                            <td>Free Shipping</td>
                                        </tr>

                                        <tr class="order-total">
                                            <th>Order Total</th>
                                            <td><strong><span class="amount"><c:out value="${order.total}"/></span></strong> </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                          </div>
                        </div>      
                       </c:forEach>
                      </c:if>
                      
                    </div>                    
                </div>
            </div>
        </div>
    </div>
  
   <%@ include file="footer.jsp" %>
  </body>
</html>
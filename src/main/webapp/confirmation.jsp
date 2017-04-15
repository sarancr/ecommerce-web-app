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
                        <h2>Order Confirmation</h2>
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
						<h3> Your order# <c:out value="${order.orderId}"/> has been successfully received and in processing. Thank you for shopping with us!</h3>
                      
                    </div>                    
                </div>
            </div>
        </div>
    </div>
   
   <%@ include file="footer.jsp" %>
  </body>
</html>
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
                        <h2>Product Detail</h2>
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
						
                        
 						<%@ include file="relatedproducts.jsp" %>
                      
                    </div>                    
                </div>
            </div>
        </div>
    </div>
   
   <%@ include file="footer.jsp" %>
  </body>
</html>
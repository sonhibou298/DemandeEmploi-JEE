 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <jsp:include page="../../../header.jsp"></jsp:include>
 <div class="main">
            
   <div class="main-content">
       <div class="container-fluid">
           <div class="row">
				<div class="col-md-6">
				 
				 <div class="panel">
				     <div class="panel-heading">
				         <h3 class="panel-title">Liste de mes Offres</h3>

				     </div>
				     <div class="panel-body">
				     <form action="ListeOffre" method="post">
				       <div class="form-group">
         			 <c:forEach items="${listeOffre}" var="o">
         			 	<div class="card">
          				<textarea class="form-control" rows="10" placeholder="Ecrivez votre offre" name="desc">
         				${o.description }
	       			</textarea> 
	       			</div>
         			  </c:forEach>
         		       </div> 
						</form>
				     </div>
				 </div>
  <!-- END MULTI CHARTS -->
			</div>
		</div>
	</div>
   </div>
</div>
<jsp:include page="../../../footer.jsp"></jsp:include>
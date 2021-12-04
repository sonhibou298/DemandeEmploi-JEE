<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../../../header.jsp"></jsp:include>
<div class="page-body">
  <div class="row">
    <div class="col-md-8">
  	<div class="panel">
      <div class="panel-heading">
          <h3 class="panel-title">Faire une Offre</h3>
          
      </div>
      <div class="panel-body">
         <form action="Offre" method="post">
         		<div class="form-group">
         			<label class="control-label">Description</label>
         			<textarea class="form-control" rows="10" placeholder="Ecrivez votre offre" name="desc"></textarea>
         		</div> 
         		<div class="form-group">
         			<select name="ese" class="form-control" aria-label="Nom Entreprise">
         			    <option seleted>Nom de l'Entreprise</option>
         			    
	         				<c:forEach items="${listEse}" var="ese">
	         					<option value="${ese.idEntreprise}">${ese.nomEntreprise} </option>
	         				</c:forEach>
         			</select>
         		</div>
         		<div class="form-group">
         			<input class="btn btn-primary" type="submit" name="ajouter" Value="Envoyer">
         			<input class="btn btn-danger" type="reset" name="supprimer" Value="Annuler">
         		</div>
         </form>
      </div> 
  </div>
  </div>
  </div>
 </div> 
<jsp:include page="../../../footer.jsp"></jsp:include>
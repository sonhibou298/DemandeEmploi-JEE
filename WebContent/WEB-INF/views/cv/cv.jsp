<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <jsp:include page="../../../headerD.jsp"></jsp:include>
 	<div class="page-body">
  <div class="row">
    <div class="col-md-8">
  	<div class="panel">
      <div class="panel-heading">
          <h3 class="panel-title">Creer un CV </h3>
          
      </div>
      <div class="panel-body">
         <form action="Cv" method="post">
         		<div class="form-group">
           			<label class="control-label">Votre Nom  </label>
           			<input class="form-control" type="text" name="nomC" required="required">
           		</div> 
           		
           		<div class="form-group">
           			<label class="control-label">Prenom</label>
           			<input class="form-control" type="text" name="prenomC" required="required">
           		</div> 
           		<div class="form-group">
           			<label class="control-label">Age</label>
           			<input class="form-control" type="number" name="age" required="required">
           		</div>
           		
           		<div class="form-group">
           			<label class="control-label">Email</label>
           			<input class="form-control" type="email" name="emailC" required="required">
           		</div>
           		
           		<div class="form-group">
           			<label class="control-label">Telephone</label>
           			<input class="form-control" type="number" name="tel" required="required">
           		</div>
           		 
           		<div class="form-group">
           			<label class="control-label">Adresse</label>
           			<input class="form-control" type="text" name="adresse" required="required">
           		</div>
           		<div class="form-group">
           			<label class="control-label">Specialite</label>
           			<input class="form-control" type="text" name="specialite" required="required">
           		</div>
           		<div class="form-group">
           			<label class="control-label">Nivau d'Etude</label>
           			<input class="form-control" type="text" name="nivEtude" required="required">
           		</div>
           		<div class="form-group">
           			<label class="control-label">Experience Professionnelle</label>
           			<input class="form-control" type="text" name="exp" required="required">
           		</div>
           		<div class="form-group">
           			<label class="control-label">Demandeur</label>
           			<input class="form-control" type="text" name="dem" required="required">
           		</div>
         		<div class="form-group">
         			<input class="btn btn-primary" type="submit" name="ajouterC" Value="Envoyer">
         			<input class="btn btn-danger" type="reset" name="supprimer" Value="Annuler">
         		</div>
         </form>
      </div> 
  </div>
  </div>
  </div>
 </div> 
 <jsp:include page="../../../footerD.jsp"></jsp:include>
<html>

<head>
    <link href="LoginAsset/codejs.css" rel="stylesheet">
</head>

<body>
    <h2></h2>
    <div class="container" id="container">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <c:if test="${message != null }">
    	<c:if test="${message == 1 }">
    	<div class = "alert alert-success">Utilisateur ajouté</div>
    	</c:if>
    	
    	<c:if test="${message == 0 }">
    	<div class = "alert alert-danger">Erreur : Utilisateur non ajouté</div>
    	</c:if>
    </c:if>
        <div class="form-container sign-up-container">
            <form action="InscripD" method="POST">
                <h3>Partie Demandeur</h3>
               
                <input type="text" placeholder="Nom" name="nom"/>
                <input type="text" placeholder="Prenom" name="prenom"/>
                <input type="email" placeholder="Email" name="email" />
                <input type="password" placeholder="Password" name="password"/>
                
                </br>
                <button name="inscription">S'incrire</button>
            </form>
        </div>
        <div class="form-container sign-in-container">
            <form action="Inscrip" method ="POST">
                <h3>Partie Entreprise</h3>
               </br></br>
                
                <input type="text" placeholder="Nom" name="nomE"/>
                <input type="email" placeholder="Email" name="emailE"/>
                <input type="password" placeholder="Mot de passe" name="passwordE"/>
                <input type="number" placeholder="Telephone" name="tel"/>
                <input type="text" placeholder="Adresse" name="adresse"/>
                </br>
                <button name="connexion">S'inscrire</button>
            </form>
        </div>
        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>DAKAR JOBS!</h1>
                    <p>" Jusqu'au bout du contrat, jusqu'au bout de soi "</p>
                    <button class="ghost" id="signIn">s'incrire en tant que Entreprise</button>
                </div>
                <div class="overlay-panel overlay-right">
                    <h1>DAKAR JOBS!</h1>
                    <p>" Jusqu'au bout du contrat, jusqu'au bout de soi "</p>
                    
                    <button class="ghost" id="signUp" name="inscription">S'incrire en tant que Demandeur</button>
                </div>
            </div>
        </div>
    </div>
    <p><a href="index.jsp">Se Connecter </a></p>

    <script src="LoginAsset/style.js"></script>
</body>

</html>
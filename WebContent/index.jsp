<html>

<head>
    <link href="LoginAsset/codejs.css" rel="stylesheet">
</head>

<body>
    <h2></h2>
    <div class="container" id="container">
    
    <c:if test="${message != null }">
    	<c:if test="${message == 1 }">
    	<div class="alert alert-success">Utilisateur ajouté</div>
    	</c:if>
    	
    	<c:if test="${message == 0 }">
    	<div class="alert alert-danger">Erreur : Utilisateur non ajouté</div>
    	</c:if>
    </c:if>
        <div class="form-container sign-up-container">
            <form action="Inscrip" method="POST">
                <h3>Creer un compte</h3>
               
                <input type="text" placeholder="Nom" name="nom"/>
                <input type="text" placeholder="Prenom" name="prenom"/>
                <input type="email" placeholder="Email" name="email" />
                <input type="password" placeholder="Password" name="password"/>
                <input type="text" placeholder="Profil" name="profil"/>
                </br>
                <button name="inscription">Inscription</button>
            </form>
        </div>
        <div class="form-container sign-in-container">
            <form action="Login" method = "POST">
                <h1>Se connecter</h1>
               </br></br>
                
                <input type="email" placeholder="Email" name="email"/>
                <input type="password" placeholder="Password" name="password"/>
                </br>
                <button name="connexion">Se Connecter</button>
            </form>
        </div>
        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>DAKAR JOBS!</h1>
                    <p>" Jusqu'au bout du contrat, jusqu'au bout de soi "</p>
                    <button class="ghost" id="signIn">Se connecter</button>
                </div>
                <div class="overlay-panel overlay-right">
                    <h1>DAKAR JOBS!</h1>
                    <p>" Jusqu'au bout du contrat, jusqu'au bout de soi "</p>
                    
                    
                </div>
            </div>
        </div>
    </div>
    <p> vous n'avez pas encore de compte? <a href="inscription.jsp">Creer un compte </a></p>

    <script src="LoginAsset/style.js"></script>
</body>

</html>
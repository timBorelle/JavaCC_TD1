# JavaCC_TD1

- Prérequis :
	- Java
	- JavaCC : javacc-5.0.zip
	- IDE : Netbeans
	- plugin JavaCC pour Netbeans : 1275348047830_org-javaccnb.nbm

- Commandes :
	- Dézipper javacc-5.0.zip
	- Ajouter javacc-5.0/bin au $PATH
	- Ajouter plugin JavaCC pour Netbeans :
	
	Netbeans : "outils" > "plugin" > "Téléchargés" > "Ajouter plugin"
 
	- Compiler avec JavaCC :
	> javacc ExprVerif.jj

	- Compiler ExprVerif.java :
	> javac ExprVerif.java

	- Exécuter et tester des expressions :
	> java ExprVerif

	entrer une expression: 1+2*3

	- Compiler ExprPostFixe avec JavaCC :
	> javacc ExprPostFixe.jj

	- Compiler ExprPostFixe.java :
	> javac ExprPostFixe.java

	- Exécuter et tester des expressions :
	> java ExprPostFixe

	1+2*5

	resultat = 1 2 5 * +


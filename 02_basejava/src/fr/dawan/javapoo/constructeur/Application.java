package fr.dawan.javapoo.constructeur;

public class Application {

    //Constructeur avec trois param�tres 
    public Utilisateur(String nom, String prenom, int age) {
//            this.nom = nom; 
//            this.prenom = prenom;
            /*
             * Un constructeur peut appeler un autre constructeur de la m�me classe
             * en utilisant la m�thode this()
             */
            this(nom, prenom);
            this.age = age;
    }

	}

}

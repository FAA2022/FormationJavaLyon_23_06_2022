package fr.dawan.javapoo.constructeur;

public class Application {

    //Constructeur avec trois paramètres 
    public Utilisateur(String nom, String prenom, int age) {
//            this.nom = nom; 
//            this.prenom = prenom;
            /*
             * Un constructeur peut appeler un autre constructeur de la même classe
             * en utilisant la méthode this()
             */
            this(nom, prenom);
            this.age = age;
    }

	}

}

package fr.dawan.javapoo.constructeur;

public class Utilisateur {

    //Visibilit� : public
    //Variable d'instance : Instance.Variable
    public String nom;  //valeur par defaut ==> null
    public String prenom;  //valeur par defaut ==> null
    public int age;      //valeur par defaut ==> 0
    
    //Variable de classe  : Classe.Variable
    public static int nbreUtilisateur;
    
    //Constructeur par defaut (sans param�tre)
    public Utilisateur() {
            nbreUtilisateur++;
    }


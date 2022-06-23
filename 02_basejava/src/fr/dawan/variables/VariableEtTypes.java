package fr.dawan.variables;

public class VariableEtTypes {

	public static void main(String[] args) {
		/*
		 * Declaration d'une variable : type nom_variable = valeur;
		 */
		// Type caractère
		char c = 'a';
		System.out.println(c);
		
		//Type entier:byte, short, int, long
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		/*
		 * On peut forcer une valeur litteral à être interprété comme un entier long
		 * en suffixant la valeur par L ou l
		 */
		long l2 = 100L;
		
		/*
		 * Pour plus de visibilité, il est egalement possible de separer les milliers
		 * par un underscore()
		 */
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de 13 : " + 13 + "\t" + 12);
		
		//Pour les variables de type float, il faut suffixer la valeur par F ou f
		float f = 0.5f;
		
		//Type complexe
		String str ="Dawan";
		int[] tab = {200, 300, 50};
		
	}
	
	
	 
}

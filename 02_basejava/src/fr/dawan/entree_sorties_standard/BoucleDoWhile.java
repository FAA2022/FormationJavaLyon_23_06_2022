package fr.dawan.entree_sorties_standard;

import java.util.Scanner;

public class BoucleDoWhile {

	public static void main(String[] args) {
	
		int age = 0;
	
	do {
		System.out.print("Entrer votre age : ");
		age = input.nextInt();
		if(age <= 0)
			System.out.println("Vous avez" + age + " ans");
	}while(age > 0); 
	 System.out.println("Vous avez " + age + " ans");
	}

}

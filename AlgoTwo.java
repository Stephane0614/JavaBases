package firstProject;

import java.util.Random;

public class AlgoTwo {
	
	public static void numbers(int nbr) {
		if(nbr>=0) {
			for(int i = 0; i <= nbr; i++ ) {
				System.out.println(i);
			}}
			else {
				for(int i = 0; i >= nbr; i-- ) {
					System.out.println(i);
			}
		}
	}
	
	public static void understand()
	{
		System.out.println("“J’ai compris comment faire une méthode !”");
	}
	
	public static void counter(String texte)
	{
		for(int i = 1; i < texte.length(); i++)
		{
			System.out.println(texte);
		}
	}
	
	public static void goldLife(int goldCoin)
	{
		int life = goldCoin/100;
		int rest = goldCoin%100;
		System.out.println("J'ai "+ life + " vie ! et il me reste " + rest + " pieces");
		
	}
	
	public static void deGame()
	{   
		int max = 6;
		int min = 1;
				
		Random De1 = new Random();
		Random De2 = new Random();
		int lancD1 = De1.nextInt((max - min) + 1) + min;
		int lancD2 = De2.nextInt((max - min) + 1) + min;
		
		System.out.println("le resultat du 1er lancer est " + lancD1);
		System.out.println("le resultat du 1er lancer est " + lancD2);
		 if(lancD1 + lancD2 == 7) {
			 System.out.println("Bravo tu a gagner !");
		 }else 
		 {
			System.out.println("Dommage tu a perdu !"); 
		 }
		
	}
	
	
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numbers(-10);
		
//		counter("hello world");
		understand();
		goldLife(897);
		deGame();
		}
	class cafetiere{

	}



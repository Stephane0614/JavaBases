package firstProject;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dix = 10;
		int vingt = 20;
		String good = "c'est good";
		String notGood = " c'est pas good ";
		String fiftyfifty = "l'un est good";
		
		
		
		if (dix < vingt && vingt > dix ) {
			System.out.println(good);
		}
		 if(dix < 50 || vingt == dix) {
			System.out.println(fiftyfifty);
		}
		 
		 if (vingt == dix) {
			 System.out.println(good);
		 }else {
			 System.out.println(notGood);
		 }
		 
		 if (vingt == dix) {
			 System.out.println("on s'en fou");
		 }else if(vingt > dix) {
			 System.out.println(good);
		 }
		 int value = 5;
		 
		 
		 switch ( value) {
		 
		 case 1:
			 System.out.println("nous somme lundi");
			 break;
		 case 2:
			 System.out.println("nous somme mardi");
			 break;
		 case 3:
			 System.out.println("nous somme mercredi");
			 break;
		 case 4:
			 System.out.println("nous somme jeudi");
			 break;
		 case 5:
			 System.out.println("nous somme vendredi");
			 break;
		 case 6:
			 System.out.println("nous somme samedi");
			 break;
		 case 7:
			 System.out.println("nous somme dimanche");
		
		 }

		 
		 
		
		
		
	
		
		

	}

}

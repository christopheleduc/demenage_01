package dem;



public class Dem {
	// Attributs
	final int MAX = 34;
	final int NB = 9;
	int cap = 0; 
	int dest = 0;
	int poids = 0;  
	int un = 0; 
	int un_trois = 0; 
	int trois_cinq = 0; 
	int plus_cinq = 0; 

	//poids = null; 
	//un = new Float (0); 
	//un_trois = 0; 
	//trois_cinq = 0; 
	//plus_cinq = 0; 
	//poids = un = un_trois = trois_cinq = plus_cinq = 0;
	

	// Constructeur(s)
	int stock = MAX; 
	
	// Methodes 	
	public void action() {
		while (stock !=0){
			//chargement();
			cap=chargement();
			System.out.println("Un voyage de " + cap + " cartons");
			dechargement();
			tas();
		}
	}

	public int chargement () {
		while (cap < NB && stock !=0){
			cap++;
			stock--;
		}
		return cap;
	}

	public void dechargement() {
		while (cap != 0){
			cap--;
			dest++;
		}
	}

	public void tas() {
		while (dest != 0){
			dest--;
			//int poids = random(8);
			int poids = (int)(Math.random() * 9 + 1);
			if (poids <= 1){
				un++;
			} else if (poids <= 3){
				un_trois++;
			} else if (poids <= 5){
				trois_cinq++;
			} else {
				plus_cinq++;
			}
		}
		System.out.println("Il y a " + un + " cartons de moins de 1 Kg");
		System.out.println("Il y a " + un_trois + " cartons entre 1 et 3Kg");
		System.out.println("Il y a " + trois_cinq + " cartons entre 3 et 5Kg");
		System.out.println("Il y a " + plus_cinq + " cartons de plus de 5 Kg");
	}
}
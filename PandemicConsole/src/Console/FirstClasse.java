package Console;

public class FirstClasse {
	
	 
	public static void main(String[] args) {
		Personne p1 = new Personne(1, "nom1", false, false, false);
		Personne p2 = new Personne(2, "nom2", false, false, false);
		Personne p3 = new Personne(3, "nom3", true , false, false);
		Personne p4 = new Personne(4, "nom4", false, false, false);
		Personne p5 = new Personne(5, "nom5", false, false, false);
		Simulation sim = new Simulation();
		
		System.out.println("Statut de p1 l'infection est "+p1.isInfect());
		System.out.println("Statut de p3 l'infection est "+p3.isInfect());
		sim.infection(p1,p3);
		System.out.println("\nApres execution de l'infection\n");
		System.out.println("Statut de p1 l'infection est "+p1.isInfect());
		System.out.println("Statut de p3 l'infection est "+p3.isInfect());
	}

}

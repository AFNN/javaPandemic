package Console;

public class Simulation {

	//simulation infection
	public void infection(Personne p1, Personne p2 ) {
		// verification qu'aucune des deux personnes n'est morte
		if(p1.isDead()==false && p2.isDead()==false) {

			if ((p1.isInfect()==true && p2.isInfect()==false)||(p1.isInfect()== false && p2.isInfect()==true))
			{
				p1.setInfect(true);
				p2.setInfect(true);
			}
			// si aucune des deux n'est infecté , si un des deux est en quarantaine et l'autre infecté
			else if ((p1.isInfect()==false && p2.isInfect()==false)||(p1.isInfect()==true && p2.isQuarataine()==true)||(p2.isInfect()==true && p1.isQuarataine()==true)) {
				System.out.println("Infection impossible");
			}
		}
		else {
			System.out.println("Une ou les deux personnes sont mortes");

		}
	}
	//simulation mise en quarantaine 
	public void quarantaine(Personne p) {
		// verification qu'aucune des deux personnes n'est morte
		if(p.isDead()==false) {
			if(p.isInfect()==true && p.isQuarataine()==false) {
				//mettre en quarantaine
				p.setQuarataine(true);
			}
		}else {
			System.out.println("La personne est morte");
		}
	}
	public void soigner(Personne p) {
		if(p.isDead()==false && p.isQuarataine()==true) {
			if(p.isInfect()==true) {
				//soigné la personne
				p.setInfect(false);
			}
			//permet de sortir quelqu'un de quarantaine
			else if(p.isInfect()==false && p.isQuarataine()==true){
				p.setQuarataine(false);
			}	
		}
		else {
			System.out.println("Il ne peut pas etre soigné , il n'est pas en quarantaine ou il est déja mort");
		}
	}
	//simulation mort 
	public void mourir(Personne p) {
		if(p.isDead()==false) {
			if(p.isInfect()) {
				p.setDead(true);
			}
		}

	}

}

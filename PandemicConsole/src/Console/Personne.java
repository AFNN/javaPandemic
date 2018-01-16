package Console;

/**
 * @author fouil
 *
 */
public class Personne {
	private int id;
	private String nom;
	private boolean infect=false;
	private boolean quarataine=false;
	private boolean dead=false;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isInfect() {
		return infect;
	}
	public void setInfect(boolean infect) {
		this.infect = infect;
	}
	public boolean isQuarataine() {
		return quarataine;
	}
	public void setQuarataine(boolean quarataine) {
		this.quarataine = quarataine;
	}
	public boolean isDead() {
		return dead;
	}
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	public Personne(int id, String nom, boolean infect,boolean quarataine, boolean dead ) {
		this.id = id;
		this.nom = nom;
		this.infect=infect;
		this.quarataine=quarataine;
		this.dead=dead;
	}
	

}

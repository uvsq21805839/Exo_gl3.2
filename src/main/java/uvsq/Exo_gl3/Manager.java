package uvsq.Exo_gl3;

public class Manager extends Employer{
	private int nb_personne_sous_ordre;
	private int commission;
	
	public Manager(int anciennete, int commission, int nb_personne_sous_ordre) {
		super(anciennete); 
		this.nb_personne_sous_ordre= nb_personne_sous_ordre;
		this.commission=commission;
	}
	
	public int calculsalaire() {
		return super.calculsalaire() + (100* nb_personne_sous_ordre) + this.commission;
	}

} 
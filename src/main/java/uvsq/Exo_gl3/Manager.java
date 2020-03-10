package uvsq.Exo_gl3;

/**
 * classe du manager d'entreprise.
 */

public class Manager extends Salary {

	private final int salaireBase=1500;
	private int nb_personne_sous_ordre;
	
	public Manager(int nb_personne_sous_ordre) {
		this.nb_personne_sous_ordre = nb_personne_sous_ordre;
	}
	
	@Override
	public double salaire() {
		
		return salaireBase + (nb_personne_sous_ordre*100);
	}

}
package uvsq.Exo_gl3;
/* Calcule de salaire des vendeurs*/


public class Vendeur extends Salary {

	final private int salaireBase=2000;
	private int commision;
	
	public Vendeur(int commision) {
		this.commision=commision;
	}
	@Override
	public double salaire() {
		return salaireBase+commision;
	}

}
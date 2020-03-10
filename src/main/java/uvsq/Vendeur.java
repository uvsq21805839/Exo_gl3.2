package uvsq;

/*
 * @ Sekou
 */
/* Calcule de salaire des vendeurs*/


public class Vendeur extends Salary {

  private final int salaireBase = 2000;
  private int commision;

  public Vendeur(int commision) {
    this.commision = commision;
  }
  
  @Override
  public double salaire() {
    return salaireBase + commision;
  }

}
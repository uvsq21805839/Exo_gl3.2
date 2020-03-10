package uvsq;

/**
 * class  Manager d'entreprise.
 */

public class Manager extends Salary {
  private final int salaireBase = 1500;
  private int nbpersonne;
  
  public Manager(int nbpersonne) {
    this.nbpersonne = nbpersonne;
  }

  @Override
public double salaire() {
    return salaireBase + (nbpersonne * 100);
  }

}

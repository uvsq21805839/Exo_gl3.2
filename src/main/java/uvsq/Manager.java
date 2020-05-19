package uvsq;

/**
 * class  Manager d'entreprise.
 */

public class Manager extends Employer{
  private int baseSubord=100;
  private int nbrSubord;
  public Manager(double salaireAnciennete, int nbrAnne, int baseSubord, int nbrSubord) {
    super(salaireAnciennete, nbrAnne);
    this.baseSubord = baseSubord;
    this.nbrSubord = nbrSubord;
  }

  public int getBaseSubord() {
    return baseSubord;
  }
  public void setBaseSubord(int baseSubord) {
    this.baseSubord = baseSubord;
  }
  public int getNbrSubord() {
    return nbrSubord;
  }
  public void setNbrSubord(int nbrSubord) {
    this.nbrSubord = nbrSubord;
  }

  @Override
  public double calculSalaire() {
    // TODO Auto-generated method stub
    return 1500 + (getSalaireAnciennete()*getNbranne())+ (baseSubord*nbrSubord);
  }
}


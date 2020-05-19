package uvsq;

/*
 * @ Sekou
 */
/* Calcule de salaire des vendeurs*/


public class Vendeur extends Employer{
  private double commision;


  public Vendeur(double salaireAnciennete,int nbrAnne, double salaireCommision){
    super(salaireAnciennete,nbrAnne);
    this.commision=salaireCommision;

  }

  public double getCommision() {
    return commision;
  }

  public void setCommision(double commision) {
    this.commision = commision;
  }

  public double calculSalaire(){
    return 1500 + getSalaireAnciennete()*getNbranne()+commision;
  }
}
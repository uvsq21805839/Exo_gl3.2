package uvsq;



public class Employer extends Salary {

  private final int salaire = 1500;
  private int anciennete;

  public Employer(int anciennete) {
    this.anciennete = anciennete;
  }

  @Override
  public double salaire() {
    return salaire + (2020 - this.anciennete) * 20;
  }

}
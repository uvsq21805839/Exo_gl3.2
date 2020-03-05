package uvsq.Exo_gl3;

public abstract class Employer{

    private int salaire;
    private int anciennete;

    public Employer(int anciennete){
        this.anciennete=anciennete;
        this.salaire = 1500;
    }

    public int calculsalaire(){
        return salaire+anciennete*20;
    }

}
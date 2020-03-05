package uvsq.Exo_gl3;
public class Vendeur extends Employer {
    private int commission;

    public Vendeur(int commission, int anciennete){
        super(anciennete);
        this.commission=commission;
    }

    @Override
    public int calculsalaire(){
        return super.calculsalaire()+commission;
    }

}
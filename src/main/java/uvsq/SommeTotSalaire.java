package uvsq;

import java.util.List;

public class SommeTotSalaire {
    public double SalaireTotal(List<Employer> employes){
        double salairetotal=0;
        for(Employer emp:employes){
            salairetotal+=emp.calculSalaire();
        }
        return salairetotal;
    }
}
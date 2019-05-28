package asaexpr;

public class ASAExprEntier extends ASAExpr {
    
    private final int valeur;
    
    public ASAExprEntier(int valeur) {
        this.valeur = valeur;
    }
      
    public String getLabelExplorateur() {
        return "ENTIER = " + valeur;
    }
    
    @Override
    public int evalue() {
        return valeur;
    }

    @Override
    public String getLabelPostfix() {
        return ""+valeur;
    }
}
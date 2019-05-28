package asaexpr;

public class ASAExprMult extends ASAExpr {
    
    private final ASAExpr e1;
    private final ASAExpr e2;
    
    public ASAExprMult(ASAExpr e1, ASAExpr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    @Override
    public ASAExpr getExpr1() {
        return e1;
    }
    
    @Override
    public ASAExpr getExpr2() {
        return e2;
    }
    @Override
    public String getLabelExplorateur() {
        return "MULT";
    }
    
    @Override
    public int evalue() {
        return e1.evalue()*e2.evalue();
    }

    @Override
    public String getLabelPostfix() {
        return "*";
    }
}
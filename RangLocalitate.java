

public enum RangLocalitate {
    I(1.00),II(2.00),III(3.00),IV(4.00);

    private double rang;

    private RangLocalitate(double rang){
        this.rang=rang;
    }

    public double getRang(){
        return rang;
    }
}

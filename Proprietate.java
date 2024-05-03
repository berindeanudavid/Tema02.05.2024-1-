public abstract class Proprietate{
    private String strada;
    private String numar;
    private double suprafata;
    public Proprietate(String strada, String numar, double suprafata){
        this.strada=strada;
        this.numar=numar;
        this.suprafata=suprafata;
    }
    public void setAdresa(String strada){
        this.strada=strada;
    }
    public void setNumar(String numar){
        this.numar=numar;
    }
    public String getStrada(){
        return strada;
    }
    public String getNumar(){
        return numar;
    }
    public void setSuprafata(double suprafata){
        this.suprafata=suprafata;
    }
    public double getSuprafata(){
        return this.suprafata;
    }
    public abstract double calculeazaSuma();
    public abstract String toString();
}

public class Cladire extends Proprietate{
    public Cladire(String strada, String numar, double suprafata){
        super(strada, numar, suprafata);
    }
    public double calculeazaSuma(){
        return 500.00*this.getSuprafata();
    }
    public String toString(){
        return "    Cladire: "+this.getStrada()+" "+this.getNumar()+"\n             Suprafata: "+this.getSuprafata()+"\n             Cost: "+this.calculeazaSuma();
    }
}

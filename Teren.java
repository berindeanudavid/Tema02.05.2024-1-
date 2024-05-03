public class Teren extends Proprietate{
    RangLocalitate rangLocalitate;
    public Teren(String strada, String numar, double suprafata, RangLocalitate rangLocalitate){
        super(strada, numar, suprafata);
        this.rangLocalitate=rangLocalitate;
    }
    public double calculeazaSuma(){
        return 350.00*this.getSuprafata()/rangLocalitate.getRang();
    }
    public String toString(){
        return "    Teren:   "+this.getStrada()+" "+this.getNumar()+"\n             Suprafata: "+this.getSuprafata()+", Rang: "+this.rangLocalitate.getRang()+"\n             Cost: "+this.calculeazaSuma();
    }
}

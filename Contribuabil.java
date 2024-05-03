import java.util.HashSet;

public class Contribuabil{
    private String nume;
    private String cnp;
    public HashSet<Proprietate> proprietati=new HashSet<Proprietate>();
    public Contribuabil(String nume, String cnp, HashSet<Proprietate> proprietati){
        this.nume=nume;
        this.cnp=cnp;
        this.proprietati.addAll(proprietati);
    }
    public Contribuabil(String nume, String cnp){
        this.nume=nume;
        this.cnp=cnp;
    }
    public String getNume(){
        return this.nume;
    }
    public String getCnp(){
        return this.cnp;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setCnp(String cnp){
        this.cnp=cnp;
    }
    public void addProprietate(Proprietate p){
        this.proprietati.add(p);
    }
    public double calculeazaSumaTotala(){
        double sum=0.00;
        for(Proprietate p:this.proprietati){
            sum+=p.calculeazaSuma();
        }
        return sum;
    }
    public String fluturas(){
        String s="Contribuabil: "+this.getNume()+"\n"+"Proprietati\n";
        for(Proprietate p:this.proprietati){
            s=s+p.toString()+"\n\n";
        }
        s=s+"Suma Totala: "+this.calculeazaSumaTotala();
        return s;
    }
}
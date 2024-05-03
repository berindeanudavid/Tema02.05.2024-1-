import java.util.HashMap;

public class ClientEx3 {
    public static void main(String[] args) {
        HashMap<String, Contribuabil> listaContribuabili=new HashMap<String, Contribuabil>();
        Proprietate t1_1=new Teren("Alecsandri", "1", 25.00, RangLocalitate.I);
        Proprietate cl1_1=new Cladire("Alecsandri", "2", 500.00);
        Proprietate t1_2=new Teren("Republicii", "1", 30.00, RangLocalitate.I);
        Contribuabil c1=new Contribuabil("Ionut Hahaian", "1234");
        c1.addProprietate(t1_1);
        c1.addProprietate(t1_2);
        c1.addProprietate(cl1_1);
        listaContribuabili.put(c1.getCnp(), c1);
        System.out.println(listaContribuabili.get("1234").fluturas());
    }
}

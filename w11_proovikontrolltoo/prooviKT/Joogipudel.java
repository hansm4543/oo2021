
public class Joogipudel{

    //Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. 
    //Samuti sees olev Jook, mis võib ka puududa. Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), 
    //samuti käsklus sellise komplekti omahinna leidmiseks. Koosta tööks automaattestid.
    String nimetus;
    double erikaal;
    double omahind;

    double maht;
    String pudelityyp;
    double mass;
    double taaraMaksumus;

    Joogipudel(double maht, String pudelityyp, double mass, double taaraMaksumus){
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;

    }
    public void lisaJook(Jook m){
        this.nimetus = m.nimetus;
        this.erikaal = m.erikaal;
        this.omahind = m.omahind;
    }

    public String massKoosJoogiga(){
        if(this.nimetus == null){return "Jook puudub";}
        return Double.toString(this.mass + this.erikaal);

    }
    public String hindKoosJoogiga(){
        if(this.nimetus == null){return "Jook puudub";}
        return Double.toString(this.omahind + this.taaraMaksumus);

    }

}
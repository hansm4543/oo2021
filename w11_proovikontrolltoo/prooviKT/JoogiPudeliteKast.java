public class JoogiPudeliteKast {
    
    /* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, 
    kastimass ning pesade arv (mitu pudelit mahub). 
    Loo käsklused kasti ja sinna kuuluvate pudelite ühise massi ja omahinna arvutamiseks. 
    Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid.
    */
    String nimetus;
    double erikaal;
    double omahind;

    double maht;
    String pudelityyp;
    double mass;
    double taaraMaksumus;

    double ruumala;
    double kogus;

    String kastityyp;
    double kastihind;
    double kastimass;
    int pesad;

    JoogiPudeliteKast(String kastityyp, double kastihind, double kastimass, int pesad){
        this.kastityyp = kastityyp;
        this.kastihind = kastihind;
        this.kastimass = kastimass;
        this.pesad = pesad;
    }
    public String kastispudelitemass(Joogipudel m){
        double mass = (this.pesad * m.mass);
        return Double.toString(mass);
    }
    public String kastispudeliteomahind(Joogipudel m){
        double omahindkokku = (this.pesad * m.omahind);
        return Double.toString(omahindkokku);
    }

    //Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid.

    public String villipudelidkastis(Joogivaat n,Joogipudel m){
        for(int i=0; i<this.pesad; i++){
            if(n.kogus < m.maht){
                return "jook on ostas ja täidetud sai " + i + " pudelit kasti";
            }
            this.kogus = this.kogus - m.maht;
        }
        return "Pudelid on täidetud ja kast on t2is";
    }
}

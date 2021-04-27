public class Joogivaat {
    
    /* Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. 
    Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). 
    Koosta käsklus kogu Joogivaaditäie Joogi villimiseks Joogipudelitesse. Koosta töö kontrolliks automaattestid.
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

    Joogivaat(double ruumala, double kogus){
        this.ruumala = ruumala;
        this.kogus = kogus;
    }
    public String taidaPudel(Joogipudel m){
        this.nimetus = m.nimetus;
        this.erikaal = m.erikaal;
        this.omahind = m.omahind;
        this.maht = m.maht;
        this.pudelityyp = m.pudelityyp;
        this.mass = m.mass;
        this.taaraMaksumus = m.taaraMaksumus;
        if(kogus < m.maht){
            return "jook on ostas";
        }
        this.kogus = this.kogus - m.maht;
        return "Pudel on täidetud";
    }
    public String taidaPudelid(int mitu, Joogipudel m){
        this.nimetus = m.nimetus;
        this.erikaal = m.erikaal;
        this.omahind = m.omahind;
        this.maht = m.maht;
        this.pudelityyp = m.pudelityyp;
        this.mass = m.mass;
        this.taaraMaksumus = m.taaraMaksumus;
        for(int i=0; i<mitu; i++){
            if(kogus < m.maht){
                return "jook on ostas ja täidetud sai " + i + " pudelit";
            }
            this.kogus = this.kogus - m.maht;
        }
        return "Pudelid on täidetud";
    }
}

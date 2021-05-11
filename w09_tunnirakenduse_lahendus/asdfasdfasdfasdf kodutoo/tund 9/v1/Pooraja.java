public class Pooraja implements Lylitatav{
    Lylitatav sisu;
    public Pooraja(Lylitatav l){sisu=l;}
    public void seisund(boolean sees){
        sisu.seisund(!sees);
    }
}
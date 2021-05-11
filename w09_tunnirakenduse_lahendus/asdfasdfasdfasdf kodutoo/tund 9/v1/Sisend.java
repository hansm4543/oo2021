import java.util.*;
public class Sisend implements Lylitatav{
    List<Lylitatav> hoidla =new ArrayList<Lylitatav>();
    public void lisa(Lylitatav l){hoidla.add(l);}
    public void seisund(boolean sees){
        for(Lylitatav l:hoidla){
            l.seisund(sees);
        }
    }
}
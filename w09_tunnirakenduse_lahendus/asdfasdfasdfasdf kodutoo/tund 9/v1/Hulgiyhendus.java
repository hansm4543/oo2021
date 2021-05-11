import java.util.*;
public abstract class Hulgiyhendus implements Voolujuht{
    List<Voolujuht> hoidla=new ArrayList<Voolujuht>();
    public void lisa(Voolujuht v){hoidla.add(v);}
}
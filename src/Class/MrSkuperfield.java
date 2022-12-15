package Class;
import Abstract.Person;
import Interface.Caress;
import Interface.Fidgeted;
import Interface.Wanted;
import Interface.See;

public class MrSkuperfield extends Person implements Fidgeted, Caress, Wanted, See {

    public MrSkuperfield(String name){setName(name);}

    public String fidgeted(){return "заёрзал на месте от нетерпения";}
    public String caress(){return "приласкать";}
    public String wanted(){return "хотел";}
    public String see(){return "увидать";}

    @Override
    public String toString(){
        return getName();
    }

}
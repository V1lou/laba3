package Class;
import Abstract.Person;
import Interface.*;

public class MrKrabs extends Person implements Turned, Drived, Choosed, Speed, Ruder {

    public MrKrabs(String name){setName(name);}

    public String turned(){return "свернул с шоссе";}
    public String drived(String car){return "вывел " + car + " на лесную дорогу, где";}
    public String choosed(){return "выбрал место";}
    public String speed(){return "сбавил скорость";}
    public String ruder(){return  "повернул руль";}

    @Override
    public String toString(){
        return getName();
    }
}

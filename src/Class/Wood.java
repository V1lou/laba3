package Class;
import Abstract.Plants;
import Interface.Grew;

public class Wood extends Plants implements Grew {
    public Wood(String name){setName(name);}

    public String grew(){return "росли не густо";}
}

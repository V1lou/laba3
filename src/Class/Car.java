package Class;
import Abstract.Person;
import Interface.Moved;

public class Car extends Person implements Moved{

    public Car(String name){setName(name);}

    public String moved(){return getName() + " поехала по лесу";}

    @Override
    public String toString(){
        return getName();
    }
}

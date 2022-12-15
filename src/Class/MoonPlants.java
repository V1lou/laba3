package Class;
import Abstract.Plants;


public class MoonPlants extends Plants {
    public MoonPlants(String name, int height){setName(name); setHeight(height);}

    public String overshadow(){ return "возвышались лунные";}


    @Override
    public boolean equals(Object obj) {
        MoonPlants a = (MoonPlants) obj;
        return getHeight() > a.getHeight();
    }

}

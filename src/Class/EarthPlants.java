package Class;
import Abstract.Plants;

public class EarthPlants extends Plants {
    public EarthPlants(String name, int height){setName(name); setHeight(height);}


    @Override
    public boolean equals(Object obj) {
        MoonPlants a = (MoonPlants) obj;
        return getHeight() > a.getHeight();
    }
}

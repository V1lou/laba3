import Class.*;

public class Main {

    static public int RandomHeight(int a, int b) {
        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        return random_number1;
    }

    public static void main(String[] args) {
        MrSkuperfield mrSkuperfield = new MrSkuperfield("Мистер Скуперфильд");
        MrKrabs mrKrabs = new MrKrabs("Мистер Крабс");
        Car car = new Car("машина");

        MoonPlants kedri = new MoonPlants("кедры", RandomHeight(1, 25));
        MoonPlants dubi = new MoonPlants("дубы", RandomHeight(1, 25));
        MoonPlants kashtani = new MoonPlants("каштаны", RandomHeight(1, 25));
        MoonPlants bambuk = new MoonPlants("бамбук", RandomHeight(1, 25));
        EarthPlants earthTrees = new EarthPlants("земные растения", RandomHeight(27, 45));
        Wood wood = new Wood("деревья");

        enum plants {кедры, дубы, каштаны, бамбук, земные_растения}
        String allOut = "";
        for (plants myVar : plants.values())
            if (myVar == plants.земные_растения){ allOut += myVar; }
            else { allOut += myVar + ", "; }

        // Вывод
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.fidgeted() + ". ");
        System.out.println(mrSkuperfield.toString() + " " + mrSkuperfield.wanted() + " " + mrSkuperfield.see() + ", " + mrSkuperfield.caress() + " медвежонка.");
        System.out.print(mrKrabs.toString() + " " + mrKrabs.turned() + ", " + mrKrabs.drived(car.getName()) + " " + kedri.overshadow() + " ");
        System.out.println(allOut + ".");

        if ((kedri.getHeight() < earthTrees.getHeight()) && (dubi.getHeight() < earthTrees.getHeight()) && (kashtani.getHeight() < earthTrees.getHeight()) && (bambuk.getHeight() < earthTrees.getHeight())) {

            System.out.println("Лунные растения: " + kedri.toString() + ", " + dubi.toString() + ", " + kashtani.toString() + ", " + bambuk.toString() + " меньше, чем " + earthTrees.toString() + ".");}
        System.out.print(mrKrabs.getName() + " " + mrKrabs.choosed() + ", где " + wood.getName() + " " + wood.grew());
        System.out.println(", " + mrKrabs.speed() + ", " + mrKrabs.ruder() + ", и " + car.moved() + ".");


    }


}


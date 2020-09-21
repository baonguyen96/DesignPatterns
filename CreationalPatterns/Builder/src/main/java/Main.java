import builder.HouseDirector;
import builder.IHouseBuilder;
import builder.TownhouseBuilder;
import builder.VillaBuilder;
import house.House;

public class Main {
    public static void main(String[] args) {
        // just need to change the concrete builder
        IHouseBuilder[] builders = new IHouseBuilder[]{new TownhouseBuilder(), new VillaBuilder()};

        for(IHouseBuilder builder : builders) {
            System.out.println(builder.getClass());

            HouseDirector director = new HouseDirector(builder);
            director.constructHouse();
            House house = director.getHouse();
            System.out.println(house.toString());

            System.out.println();
        }

    }
}

package builder;

import house.House;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseDirectorTest {
    private HouseDirector houseDirector;
    private House house;
    private final IHouseBuilder villaBuilder = new VillaBuilder();
    private final IHouseBuilder townhouseBuilder = new TownhouseBuilder();

    @Test
    public void testBuildVilla() {
        houseDirector = new HouseDirector(villaBuilder);
        houseDirector.constructHouse();
        house = houseDirector.getHouse();
        assertEquals("House{type='Villa', roof='Solar panel roof', wall='Brick wall', floor='Hard-wood floor'}", house.toString());
    }

    @Test
    public void constructTownhouse() {
        houseDirector = new HouseDirector(townhouseBuilder);
        houseDirector.constructHouse();
        house = houseDirector.getHouse();
        assertEquals("House{type='Townhouse', roof='Wood roof', wall='Paper wall', floor='Carpet floor'}", house.toString());
    }
}
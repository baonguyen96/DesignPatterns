package builder;

import house.House;

public class HouseDirector {
    private IHouseBuilder houseBuilder;

    public HouseDirector(IHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

    public void constructHouse() {
        houseBuilder.buildFloor();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
    }
}

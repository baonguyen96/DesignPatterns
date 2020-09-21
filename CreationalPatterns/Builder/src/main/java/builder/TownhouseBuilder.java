package builder;

import house.House;

public class TownhouseBuilder implements IHouseBuilder {
    private final House house;

    public TownhouseBuilder() {
        this.house = new House("Townhouse");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood roof");
    }

    @Override
    public void buildWall() {
        house.setWall("Paper wall");
    }

    @Override
    public void buildFloor() {
        house.setFloor("Carpet floor");
    }

    @Override
    public House getHouse() {
        return house;
    }
}

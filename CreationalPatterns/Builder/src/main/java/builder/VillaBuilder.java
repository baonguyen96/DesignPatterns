package builder;

import house.House;

public class VillaBuilder implements IHouseBuilder {
    private final House house;

    public VillaBuilder() {
        this.house = new House("Villa");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Solar panel roof");
    }

    @Override
    public void buildWall() {
        house.setWall("Brick wall");
    }

    @Override
    public void buildFloor() {
        house.setFloor("Hard-wood floor");
    }

    @Override
    public House getHouse() {
        return house;
    }
}

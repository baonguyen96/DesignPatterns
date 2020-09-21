package builder;

import house.House;

public interface IHouseBuilder {
    void buildRoof();
    void buildWall();
    void buildFloor();
    House getHouse();
}

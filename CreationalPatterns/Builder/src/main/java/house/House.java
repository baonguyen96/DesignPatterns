package house;

public class House implements HousePlan {
    private String type;
    private String roof;
    private String wall;
    private String floor;

    public House(String type) {
        this.type = type;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setWall(String wall) {
        this.wall = wall;
    }

    @Override
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", roof='" + roof + '\'' +
                ", wall='" + wall + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}

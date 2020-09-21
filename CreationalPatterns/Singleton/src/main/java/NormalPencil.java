public class NormalPencil {
    private static int instanceId = 0;

    public NormalPencil(){
        instanceId++;
    }

    public int getInstanceId() {
        return instanceId;
    }

    @Override
    public String toString() {
        return "NormalPencil #" + instanceId;
    }
}
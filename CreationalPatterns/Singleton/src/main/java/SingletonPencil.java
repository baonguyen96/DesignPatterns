public class SingletonPencil {
    private static int instanceId = 0;
    private static SingletonPencil instance;

    public synchronized static SingletonPencil getInstance() {
        if(instance == null) {
            instance = new SingletonPencil();
        }

        return instance;
    }

    private SingletonPencil() {
        instanceId++;
    }

    @Override
    public String toString() {
        return "SingletonPencil #" + instanceId;
    }
}
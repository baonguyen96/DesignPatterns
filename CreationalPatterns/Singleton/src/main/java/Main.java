public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            NormalPencil pencil = new NormalPencil();
            System.out.println(pencil);
        }

        System.out.println();

        for(int i = 0; i < 10; i++) {
            SingletonPencil pencil = SingletonPencil.getInstance();
            System.out.println(pencil.toString());
        }
    }
}
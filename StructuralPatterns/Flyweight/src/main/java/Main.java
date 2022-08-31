import clone.ClonedBook;
import common.BookStore;
import flyweight.FlyweightBook;
import flyweight.BookTypeFactory;

public class Main {
    // Some huge number of objects to stress test, can reduce per system.
    // However, should keep it as high as possible as smaller set does not really highlight the usage of Flyweight pattern
    static final int BOOK_COUNT = 20_000_000;

    // just some random data to consume more memory
    static final String OTHER_DATA = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ornare dui sed accumsan volutpat. Morbi in augue eget est auctor ullamcorper. Phasellus mollis mattis tellus, in ultricies dui euismod eu. Mauris condimentum dignissim urna, ac blandit lacus faucibus vitae. Nam aliquet nibh eu semper congue. Fusce tempor a libero quis hendrerit. Vivamus bibendum quam vitae maximus molestie. Morbi bibendum mollis tellus, lacinia auctor leo efficitur id. Pellentesque auctor id nibh sed posuere. Aenean at quam vel enim lacinia scelerisque. Vestibulum non libero vel massa volutpat imperdiet vitae et dui. In hac habitasse platea dictumst. Pellentesque rutrum sagittis augue, et bibendum mauris semper non. Integer in molestie mauris, ac posuere eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam luctus euismod velit.\n" +
            "\n" +
            "Etiam blandit sapien tempus metus faucibus, sit amet mollis quam posuere. Aenean gravida sagittis dictum. Phasellus leo velit, blandit sit amet bibendum eget, egestas eget eros. Etiam commodo bibendum sapien, non aliquet urna tincidunt id. Etiam feugiat, mi aliquet viverra vestibulum, nunc mauris iaculis sem, eget lacinia lectus erat eget nibh. Donec sed gravida ipsum. Duis ultricies magna mauris, quis dictum ex consequat nec. Maecenas non mi in orci faucibus ultricies ac id lectus. Donec sagittis, tortor ut iaculis egestas, erat nulla cursus augue, et hendrerit urna felis in purus. Sed at odio mauris. Quisque volutpat, urna in varius fermentum, mi magna efficitur est, tempor cursus purus lorem vel eros. Etiam dui urna, luctus ac fringilla vitae, placerat a magna. Fusce ac leo nec ex convallis fringilla sit amet in mauris. Nulla et nisl rhoncus, suscipit sem non, commodo nibh. In et arcu nec ex lacinia feugiat eget at ex. Aenean eget erat eget odio venenatis commodo.\n" +
            "\n" +
            "Etiam ullamcorper volutpat tortor, sed finibus magna consequat eget. Curabitur ornare eros at erat iaculis, sed rhoncus nunc ultrices. Aliquam convallis quis velit vel vehicula. Quisque ut nulla lacinia, interdum arcu ut, aliquet quam. Donec fringilla, velit sit amet accumsan ullamcorper, dui quam porttitor sapien, eget tincidunt enim massa eget nibh. Etiam id luctus magna, vitae pulvinar eros. Duis eu diam ac elit suscipit ultrices id eget sem. Vivamus nisl magna, placerat nec placerat vel, imperdiet quis urna. Pellentesque ut commodo ex. Morbi sed diam at dui efficitur ultricies. Phasellus convallis ullamcorper vehicula. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Morbi facilisis justo in magna sagittis, a auctor nisi lobortis.\n" +
            "\n" +
            "Pellentesque elit lacus, condimentum sed porttitor ut, fermentum eget urna. Aenean rutrum rutrum augue ac ornare. Praesent euismod quam eu dapibus condimentum. Vestibulum et efficitur sem, vitae ultricies erat. Sed non nisi et mauris mollis dapibus non vitae risus. Nulla eu nibh sit amet massa scelerisque porttitor. Nulla elementum odio nibh, nec faucibus arcu iaculis sollicitudin. Quisque lobortis blandit mollis. Fusce iaculis odio at diam scelerisque, sed dictum tellus consequat. In dui leo, congue non ultricies non, fringilla id massa. Donec iaculis cursus velit, eget convallis lectus sagittis sit amet.\n" +
            "\n" +
            "Nulla facilisi. Donec facilisis in metus eu sagittis. Vestibulum lobortis enim in nisl fringilla condimentum. Aenean nec orci vel ante faucibus ultrices. Praesent placerat neque vitae ipsum accumsan porta. Aliquam varius tortor arcu, quis bibendum augue laoreet vitae. Cras eget fringilla odio, sit amet dignissim libero. Morbi odio urna, tempor ut sodales a, volutpat ut eros. Ut hendrerit facilisis pellentesque. Nulla facilisi. Morbi sit amet justo libero. Maecenas vel felis eget magna commodo facilisis quis id mi. Proin a eros in felis lacinia varius sit amet ac elit.";

    public static void main(String[] args) {
        // expect to see less memory consumption with Flyweight version, or even OutOfMemoryError with the Clone version
        try {
            runWithClone(BOOK_COUNT);
        }
        catch (OutOfMemoryError e) {
            e.printStackTrace();
        }

        try {
            runWithFlyweight(BOOK_COUNT);
        }
        catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }

    public static long runWithClone(int bookCount) {
        System.out.println("Run with Clone");
        long startTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        System.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        BookStore store = new BookStore();
        for (int i = 0; i < bookCount; i++) {
            store.storeBook(new ClonedBook("book" + i, String.valueOf(i), String.valueOf(i % 2), "distributor" + (i % 2), OTHER_DATA));
        }
        System.out.println("Book store now has " + store.countBooks() + " books");

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.gc();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsage = memoryAfter - memoryBefore;
        System.out.println("Completed in " + elapsedTime + " ms with " + memoryUsage + " bytes memory");
        System.out.println();

        return memoryUsage;
    }

    public static long runWithFlyweight(int bookCount) {
        System.out.println("Run with Flyweight");
        long startTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        System.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        BookStore store = new BookStore();
        for (int i = 0; i < bookCount; i++) {
            store.storeBook(new FlyweightBook("book" + i, String.valueOf(i), BookTypeFactory.getBookType(String.valueOf(i % 2), "distributor" + (i % 2), OTHER_DATA)));
        }
        System.out.println("Book store now has " + store.countBooks() + " books");

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.gc();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsage = memoryAfter - memoryBefore;
        System.out.println("Completed in " + elapsedTime + " ms with " + memoryUsage + " bytes memory");
        System.out.println();

        return memoryUsage;
    }
}

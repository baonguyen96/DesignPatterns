package adapter;

public class CsvReader implements IReader {
    @Override
    public void read() {
        System.out.println("CsvReader reads Csv using read method");
    }
}

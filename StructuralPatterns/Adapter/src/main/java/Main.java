import adapter.CsvReader;
import adapter.ExcelReaderAdapter;
import adapter.IReader;
import external.ExcelReader;

public class Main {
    public static void main(String[] args) {
        // can wrap this in a factory for cleaner consumption
        IReader csv = new CsvReader();
        csv.read();

        IReader excel = new ExcelReaderAdapter(new ExcelReader());
        excel.read();
    }
}

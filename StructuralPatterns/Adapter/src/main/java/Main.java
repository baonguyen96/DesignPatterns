import adapter.CsvReader;
import adapter.ExcelReader;
import adapter.IReader;
import external.ExternalExcelReader;

public class Main {
    public static void main(String[] args) {
        // can wrap this in a factory for cleaner consumption
        IReader csv = new CsvReader();
        System.out.println(csv.read());

        IReader excel = new ExcelReader(new ExternalExcelReader());
        System.out.println(excel.read());
    }
}

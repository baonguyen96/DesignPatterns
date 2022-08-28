package adapter;

import external.ExternalExcelReader;

public class ExcelReader implements IReader {
    private final ExternalExcelReader excelReader;

    public ExcelReader(ExternalExcelReader excelReader) {
        this.excelReader = excelReader;
    }

    @Override
    public String read() {
        return "ExcelReader read: " + String.join(" ", excelReader.readExcel());
    }
}

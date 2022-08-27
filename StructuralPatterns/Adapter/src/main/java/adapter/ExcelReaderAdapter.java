package adapter;

import external.ExcelReader;

public class ExcelReaderAdapter implements IReader {

    private ExcelReader excelReader;

    public ExcelReaderAdapter(ExcelReader excelReader) {
        this.excelReader = excelReader;
    }

    @Override
    public void read() {
        excelReader.readExcel();
    }
}

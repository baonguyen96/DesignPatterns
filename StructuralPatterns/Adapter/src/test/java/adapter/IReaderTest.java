package adapter;


import external.ExternalExcelReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IReaderTest {
    private IReader reader;

    @Test
    public void testReadCsv() {
        reader = new CsvReader();
        assertEquals("CsvReader reads Csv using read method", reader.read());
    }

    @Test
    public void testReadExcel() {
        reader = new ExcelReader(new ExternalExcelReader());
        assertEquals("ExcelReader read: ExternalExcelReader reads Excel using readExcel method", reader.read());
    }
}
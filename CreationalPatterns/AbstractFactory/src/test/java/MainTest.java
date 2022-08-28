import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @Test
    public void main() {
        Main.main(new String[]{""});
        String expected = "class factory.MacOsFactory\n" +
                "MacKeyboard has Command-Option\n" +
                "MacTerminal for life\n" +
                "\n" +
                "class factory.WindowsOsFactory\n" +
                "Windows keyboard has CTL-FN-Win\n" +
                "Powershell is king";
        assertEquals(expected, outContent.toString().trim().replace("\r", ""));
    }
}
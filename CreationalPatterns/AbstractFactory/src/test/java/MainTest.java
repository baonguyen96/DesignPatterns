import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    @org.junit.jupiter.api.Test
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
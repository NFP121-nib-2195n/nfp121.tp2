package question2;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

/**
 * The test class TestForFC.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestForFC
{
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    /**
     * Default constructor for test class TestForFC
     */
    public TestForFC()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        System.setOut(standardOut);
    }

    @Test
    public void test_exception_NAN()
    {
        question2.FahrenheitCelsius.main(new String[]{"11","jessi"});
        assertEquals("error : For input string: \"jessi\"",outputStreamCaptor.toString().trim());
    }
}


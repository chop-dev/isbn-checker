import org.junit.Test;
import static org.junit.Assert.*;

public class ISBNCheckerTest {

    //===========================================================================
    // Tests to see if it can determine a valid ISBN
    //===========================================================================

    @Test
    public void ValidTest1() {
        assertEquals("Valid", ISBNChecker.checkISBN("9780316066525"));
    }

    @Test
    public void ValidTest2() {
        assertEquals("Valid", ISBNChecker.checkISBN("9783866155237"));
    }

    @Test
    public void ValidTest3() {
        assertEquals("Valid", ISBNChecker.checkISBN("9780345453747"));
    }

    //===========================================================================
    // Tests to see if it can determine a invalid ISBN
    //===========================================================================

    @Test
    public void InvalidTest1() {
        assertEquals("Invalid", ISBNChecker.checkISBN("031606652X"));
    }

    @Test
    public void InvalidTest2() {
        assertEquals("Invalid", ISBNChecker.checkISBN("9783876155237"));
    }

    @Test
    public void InvalidTest3() {
        assertEquals("Invalid", ISBNChecker.checkISBN("0345453747"));
    }

    //===========================================================================
    // Tests to see if it is generating valid ISBN's
    //===========================================================================

    @Test
    public void GenerateTest1() {
        assertEquals("9780316066525",ISBNChecker.checkISBN("0316066524"));
    }

    @Test
    public void GenerateTest2() {
        assertEquals("9783866155237", ISBNChecker.checkISBN("3866155239"));
    }
    //===========================================================================
}

import org.junit.Test;
import static org.junit.Assert.*;

public class ISBNCheckerTest {

    @Test
    public void test1() {
        assertEquals("Valid", ISBNChecker.checkISBN("9780316066525"));
    }

    @Test
    public void test2() {
        assertEquals("Valid", ISBNChecker.checkISBN("9783866155237"));
    }

    @Test
    public void test3() {
        assertEquals("Valid", ISBNChecker.checkISBN("9780345453747"));
    }

    @Test
    public void test4() {
        assertEquals("Invalid", ISBNChecker.checkISBN("031606652X"));
    }

    @Test
    public void test5() {
        assertEquals("Invalid", ISBNChecker.checkISBN("9783876155237"));
    }

    @Test
    public void test6() {
        assertEquals("Invalid", ISBNChecker.checkISBN("0345453747"));
    }

}

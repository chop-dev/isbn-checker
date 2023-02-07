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

    @Test
    public void test7() {
        assertEquals("9780316066525",ISBNChecker.checkISBN("0316066524"));
    }

    @Test
    public void test8() {
        assertEquals("9783866155237", ISBNChecker.checkISBN("3866155239"));
    }

    @Test
    public void test9() {
        assertEquals("9788174504944", ISBNChecker.checkISBN("817450494X"));
    }
}

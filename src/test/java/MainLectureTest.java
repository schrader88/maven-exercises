import org.junit.Test;
// Below import means we do not need to instantiate the Assert class:
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainLectureTest {

    @Test
    public void testTwoIsTwo() {
        assertEquals(2, 2);
    }

    @Test
    public void testAssertions() {
        int num = 2;
        assertEquals(2, num);
        assertEquals("bob", "bob", "bob");
    }

    @Test
    public void testEqualsNotEquals() {
        String Codeup = "Codeup";
        assertEquals(Codeup, "Codeup");
//        assertNotEquals(Codeup, "Codeup");
    }

    @Test
    public void testNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testTrueFalse() {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}

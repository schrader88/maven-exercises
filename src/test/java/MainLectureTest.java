import org.junit.Test;
// Below import means we do not need to instantiate the Assert class:
import static org.junit.Assert.*;

public class MainLectureTest {

    @Test
    public void testTwoIsTwo() {
        assertEquals(2, 2);
    }
}

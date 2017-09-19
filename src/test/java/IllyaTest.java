import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by danny50610 on 2017/9/19.
 */
public class IllyaTest {

    @Test
    public void testTest() {
        Illya illya = new Illya();

        assertEquals(4, illya.test(2));
        assertEquals(8, illya.test(4));
        assertEquals(16, illya.test(8));
        assertEquals(-2, illya.test(-1));
    }

}

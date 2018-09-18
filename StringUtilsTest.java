package other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    StringUtils stringUtils;


    @Before
    public void setup() {
        stringUtils = new StringUtils();
    }

    @Test
    public void stringContainsChar() {
        String s = "scott";
        char c = 'c';

        boolean actual =stringUtils.doesStringContain(s,c);
        assertEquals(true, actual);
    }

    @Test (expected = NullPointerException.class)
    public void doesStringContainNullValue() {
        char c = 'c';

        stringUtils.doesStringContain(null, c);
    }

    @Test
    public void countNumOccurencesOfChar() {
        String s = "scott";
        char t = 't';

        int actual = stringUtils.countNumOccurences(s,t);
        assertEquals(2, actual);
    }
}

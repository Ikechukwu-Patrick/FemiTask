import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    @Test
    public void testMethodParse(){
        HugeInteger hugeInteger = new HugeInteger();
        int[] array = {2,4,2,5,2,6,2,7,2,8,2,6,2,5,2,4,2,3,2,4,2,5,2,6,2,7,2,8,2,9,2,6,2,5,2,4,2,3,2,6};
        int[] actual = hugeInteger.parse("2425262728262524232425262728292625242326");
        assertArrayEquals(array, actual);
    }
    @Test
    public void testIfElementsIsGreaterThan40ThrowsAnException(){
        HugeInteger hugeInteger = new HugeInteger();
        assertThrows(NumberOutOfRangeException.class, () -> {
            hugeInteger.parse("242526272826252423242526272829262524232623");
        });
    }
}
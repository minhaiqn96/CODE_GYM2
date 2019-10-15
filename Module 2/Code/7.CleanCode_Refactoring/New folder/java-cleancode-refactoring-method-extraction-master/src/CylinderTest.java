import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        Double expected = new Double(0);

        Double result = new Double(Cylinder.getVolume(radius, height)) ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        Double expected=new Double(18.84955592153876);

        Double result = new Double(Cylinder.getVolume(radius, height));
        assertEquals(expected, result);
    }
}
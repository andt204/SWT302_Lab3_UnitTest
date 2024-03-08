import com.mycompany.calculateps.Rectangle;
import com.mycompany.calculateps.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void testValidDimensions() {
        Shape rectangle = new Rectangle(5, 10);
        Assertions.assertEquals(50, rectangle.getArea(), 0.01);
        Assertions.assertEquals(30, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testZeroDimensions() {
        Shape rectangle = new Rectangle(0, 0);
        Assertions.assertEquals(0, rectangle.getArea(), 0.01);
        Assertions.assertEquals(0, rectangle.getPerimeter(), 0.01);
    }

    @Test
    void testNegativeDimensions() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, -1));
    }

    @Test
    void testInvalidDimensions() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(Double.parseDouble("a"), 5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, Double.parseDouble("b")));
    }

    @Test
    void testLargeDimensions() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(9999999, 9999999));
    }
}

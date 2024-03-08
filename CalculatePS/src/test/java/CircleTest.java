
import com.mycompany.calculateps.Circle;
import com.mycompany.calculateps.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    void testValidRadius() {
        Shape circle = new Circle(5);
        Assertions.assertEquals(78.54, circle.getArea(), 0.01);
    }

    @Test
    void testZeroRadius() {
        Shape circle = new Circle(0);
        Assertions.assertEquals(0, circle.getArea(), 0.01);
    }

    @Test
    void testNegativeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    void testInValidRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(Double.parseDouble("a")));
    }

    @Test
    void testLargeRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle(9999999));
    }

    @Test
    void testNullRadius() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Circle());
    }
}

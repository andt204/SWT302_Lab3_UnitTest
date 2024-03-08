
import com.mycompany.calculateps.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andep
 */
public class TriangleTest {
     @Test
    void testValidEquilateralTriangle() {
        Triangle triangle = new Triangle(3, 3, 3);
        Assertions.assertEquals(3.90, triangle.getArea(), 0.01);
    }

    @Test
    void testValidRightTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        Assertions.assertEquals(6.00, triangle.getArea(), 0.01);
    }

    @Test
    void testValidScaleneTriangle() {
        Triangle triangle = new Triangle(3, 4, 6);
        Assertions.assertEquals(5.33, triangle.getArea(), 0.01);
    }

    @Test
    void testInvalidNonTriangle() {
        Triangle triangle = new Triangle(1, 2, 5);
        Assertions.assertEquals(0, triangle.getArea(), 0.01);
    }

    @Test
    void testInvalidNegativeSide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(-3, 4, 5));
    }

    @Test
    void testInvalidZeroSide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 4, 5));
    }

    @Test
    void testInvalidLargeSide() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, Double.MAX_VALUE));
    }

    @Test
    void testInvalidNaN() {
        Triangle triangle = new Triangle(Double.NaN, 4, 5);
        Assertions.assertEquals(0, triangle.getArea(), 0.01);
    }

    @Test
    void testInvalidInfinity() {
        Triangle triangle = new Triangle(Double.POSITIVE_INFINITY, 4, 5);
        Assertions.assertEquals(0, triangle.getArea(), 0.01);
    }
}

package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru)
 * @version 0.1
 * @since 18.03.19
 */
public class TriangleTest {

    /**
     * Square of triangle.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle();
        double result = triangle.area(0, 0, 0, 3, 4, 0);
        double expected = 6;
        assertThat(result, closeTo(expected, 0.1));
    }
}
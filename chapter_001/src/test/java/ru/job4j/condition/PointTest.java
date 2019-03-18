package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version $Id$.
 * @since 18.03.19
 */
public class PointTest {

    /**
     * Test formula.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}
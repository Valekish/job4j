package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 18.03.19.
 */
public class MaxTest {

    /**
     * Test left < right.
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.maximum(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Test left > right.
     */
    @Test
    public void whenMax3To1Then3() {
        Max max = new Max();
        int result = max.maximum(3, 1);
        assertThat(result, is(3));
    }

    /**
     * Test left = right.
     */
    @Test
    public void whenMax2To2Then2() {
        Max max = new Max();
        int result = max.maximum(2, 2);
        assertThat(result, is(2));
    }
}
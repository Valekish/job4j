
package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 18.03.19.
 */
public class MultiMaxTest {

    /**
     * Test second max value.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test first max value.
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    /**
     * Test third max value.
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 4);
        assertThat(result, is(4));
    }

    /**
     * Test first = second = third.
     */
    @Test
    public void whenEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }
}
package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 19.03.19
 */
public class FactorialTest {

    /**
     * Test for factorial of 5.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Test for factorial of 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
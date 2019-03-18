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
public class CounterTest {

    /**
     * Test from 1 to 10.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }
}
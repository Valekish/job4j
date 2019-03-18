package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version $Id$.
 * @since 18.03.19.
 */
public class CalculatorTest  {

	/**
	 * Test addition.
	 */
    @Test
    public void whenAdd1Plus1Then2()  {
        Calculator calc = new Calculator();
        double result = calc.add(1, 1);
        double expected = 2;
        assertThat(result, is(expected));
    }

	/**
	 * Test subtraction.
	 */
	@Test
	public void whenSub2From4Then2() {
		Calculator calc = new Calculator();
		double result = calc.subtract(4, 2);
		double expected = 2;
		assertThat(result, is(expected));
	}

	/**
	 * Test multiplication.
	 */
	@Test
	public void whenMult2By3Then6() {
		Calculator calc = new Calculator();
		double result = calc.multiple(2, 3);
		double expected = 6;
		assertThat(result, is(expected));
	}

	/**
	 * Test division.
	 */
	@Test
	public void whenDiv2By2Then1() {
		Calculator calc = new Calculator();
		double result = calc.div(2, 2);
		double expected = 1;
		assertThat(result, is(expected));
	}
}
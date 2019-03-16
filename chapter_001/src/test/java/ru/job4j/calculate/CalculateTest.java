package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author Valentin Kirjan (valekishwork@mail.ru)
 * @version $Id$
 * @since 0.1
 */
 
public class CalculateTest {
	
 /**
 * Test echo
 */

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Valentin Kirjan";
    String expect = "Echo, echo, echo : Valentin Kirjan"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }

}
package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.ruToDol(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.ruToEu(70);
        assertThat(result, is(1));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Converter converter = new Converter();
        int result = converter.euToRu(1);
        assertThat(result, is(70));
    }

    @Test
    public void when1DollarToRubleThen60() {
        Converter converter = new Converter();
        int result = converter.dolToRu(1);
        assertThat(result, is(60));
    }
}

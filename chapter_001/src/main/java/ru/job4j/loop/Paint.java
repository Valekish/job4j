package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 19.03.19
 */

public class Paint {

    /**
     * Рефакторинг кода.
     * @param height высота.
     * @param width ширина.
     * @param predict ожидаемое значение.
     * @return пирамида.
     */
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();

    }

    /**
     * Создание правой части пирамиды.
     * @param height высота.
     * @return правая часть.
     */
    public String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Создание левой части пирамиды.
     * @param height высота.
     * @return левая часть.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Создание пирамиды.
     * @param height высота.
     * @return пирамида.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }
}

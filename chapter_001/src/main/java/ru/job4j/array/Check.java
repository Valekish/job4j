package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 22.03.19
 */
public class Check {

    /**
     * Проверяет массив на true и false.
     * @param data массив.
     * @return значение массива.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                return result;
            }
            if (data[index] != data[data.length - 1]) {
                return result;
            } else {
                result = true;
            }
        }
        return result;
    }
}




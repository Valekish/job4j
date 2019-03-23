package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 23.03.19
 */
public class ArrayChar {
    private char[] data;

    /**
     * Обертка над строкой.
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int index = 0; index < value.length; index++) {
                if (value[index] != data[index]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
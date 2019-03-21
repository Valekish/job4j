package ru.job4j.array;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 21.03.19
 */
public class FindLoop {

    /**
     * Ищет элемент в массиве.
     * @param data массив.
     * @param el элемент.
     * @return индекс массива.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
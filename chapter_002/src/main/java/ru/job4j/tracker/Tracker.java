package ru.job4j.tracker;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Valentin Kirjan (valekishwork@mail.ru).
 * @version 0.1
 * @since 03.05.19
 */
public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        long unixTime = System.currentTimeMillis() / 1000L;
        long randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        long idl = unixTime + randomNum;
        String id = String.valueOf(idl);
        return id;
    }

    /**
     * Поиск по id в массиве
     * @param id уникальный ключ объекта
     * @return объект
     */
    public Item findById(String id) {
        for (int p = 0; p < items.length; p++) {
            if (items[p].getId().equals(id)) {
                return items[p];
            }
        }
        return null;
    }

    /**
     * Замена объекта в массиве
     * @param id уникальный ключ объекта
     * @param item объект
     * @return результат операции
     */
    public boolean replace(String id, Item item) {
        for (int p = 0; p < items.length; p++) {
            if (items[p].getId().equals(id)) {
                items[p] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Удалить объект из массива
     * @param id уникальный ключ объекта
     * @return результат операции
     */
    public boolean delete(String id) {
        for (int p = 0; p < items.length; p++) {
            if (items[p].getId().equals(id)) {
                items[p] = null;
                System.arraycopy(items, p + 1, items, p, items.length - p - 1);
                return true;
            }
        }
        return false;
    }

    /**
     * Список всех объектов из массива
     * @return массив объектов без null
     */
    public Item[] findAll() {
        for (int p = 0; p < items.length; p++) {
            if (items[p] == null) {
                Item[] list = new Item[p];
                System.arraycopy(items, 0, list, 0, p);
                return list;
            } else if (p == items.length - 1) {
                Item[] list = new Item[p + 1];
                System.arraycopy(items, 0, list, 0, p + 1);
                return list;
            }
        }
        return null;
    }

    /**
     * Поиск объектов по имени в массиве
     * @param key имя
     * @return массив объектов без null
     */
    public Item[] findByName(String key) {
        Item[] copy = new Item[100];
        int i = 0;
        for (int p = 0; p < items.length; p++) {
            if (items[p] == null) {
                for (int a = 0; a < copy.length; a++) {
                    if (copy[a] == null) {
                        Item[] list = new Item[a];
                        System.arraycopy(copy, 0, list, 0, a);
                        return list;
                    }
                }
            } else if (items[p].getName().equals(key)) {
                System.arraycopy(items, p, copy, i, 1);
                i++;
            }
        }
        return null;
    }
}
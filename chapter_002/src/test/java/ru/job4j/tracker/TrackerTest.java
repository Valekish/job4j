package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    /**
     * Тест добавления объекта в трекер
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест редактирования объекта в трекере
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест удаления объекта в трекере
     */
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1", "testDescription1", 123L);
        Item two = new Item("test2", "testDescription2", 1234L);
        Item three = new Item("test3", "testDescription3", 12345L);
        Item four = new Item("test4", "testDescription4", 123456L);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        tracker.add(four);
        tracker.delete(two.getId());
        Item[] expect = {one, three, four};
        assertThat(tracker.findAll(), is(expect));
    }

    /**
     * Тест поиска всех объектов в трекере
     */
    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1", "testDescription1", 123L);
        Item two = new Item("test2", "testDescription2", 1234L);
        Item three = new Item("test3", "testDescription3", 12345L);
        Item four = new Item("test4", "testDescription4", 123456L);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        tracker.add(four);
        Item[] expect = {one, two, three, four};
        assertThat(tracker.findAll(), is(expect));
    }

    /**
     * Тест поиска всех объектов с одинаковым именем в трекере
     */
    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1", "testDescription1", 123L);
        Item two = new Item("test1", "testDescription2", 1234L);
        Item three = new Item("test2", "testDescription3", 12345L);
        Item four = new Item("test1", "testDescription4", 123456L);
        tracker.add(one);
        tracker.add(two);
        tracker.add(three);
        tracker.add(four);
        Item[] expect = {one, two, four};
        assertThat(tracker.findByName("test1"), is(expect));
    }
}
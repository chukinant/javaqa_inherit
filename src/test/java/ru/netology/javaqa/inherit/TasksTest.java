package ru.netology.javaqa.inherit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TasksTest {

    @Test
    public void shouldMatchSimpleTask() {
        SimpleTask task = new SimpleTask(11, "Заказать консультацию");

        boolean actual = task.matches("Заказать");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotMatchSimpleTask() {
        SimpleTask task = new SimpleTask(11, "Заказать консультацию");

        boolean actual = task.matches("была");

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldMatchEpic() {
        Epic task = new Epic(11, new String[]{"Написать тесты", "Вопросы к совещанию", "Начать регрессионное тестирование"});

        boolean actual = task.matches("Написать тесты");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotMatchEpic() {
        Epic task = new Epic(11, new String[]{"Написать тесты", "Вопросы к совещанию", "Начать регрессионное тестирование"});

        boolean actual = task.matches("Почистить обувь");

        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldMatchMeetingTopic() {
        Meeting task = new Meeting(11, "Sprint planning", "javaqa", "2024-12-24");

        boolean actual = task.matches("Sprint planning");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchMeetingProject() {
        Meeting task = new Meeting(11, "Sprint planning", "javaqa", "2024-12-24");

        boolean actual = task.matches("javaqa");

        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldNotMatchMeetingStart() {
        Meeting task = new Meeting(11, "Sprint planning", "javaqa", "2024-12-24");

        boolean actual = task.matches("2024-12-24");

        Assertions.assertFalse(actual);
    }

}

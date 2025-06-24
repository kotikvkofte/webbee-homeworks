package org.ex9.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * «Подписчик» (Concrete Observer) паттерна <i>Observer</i>.
 * <p>
 * Сохраняет все полученные новости в списке обновлений.
 * </p>
 *
 * @author Краковцев Артём
 * @see TelegramChannel
 */
public class TelegramUser implements Observer {

    /**
     * Имя пользователя.
     */
    private final String name;
    /**
     * Список обновлений.
     */
    private final List<String> updatesList;

    public TelegramUser(String name) {
        this.name = name;
        this.updatesList = new ArrayList<>();
    }

    /**
     * Добавляет новость в список обновлений.
     * @param news текст новости
     */
    @Override
    public void update(String news) {
        updatesList.add(name + " получил новую новость - " + news);
    }

    /**
     * @return список обновлений
     */
    public List<String> getUpdatesList() {
        return updatesList;
    }

}

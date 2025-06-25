package org.ex9.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject паттерна <i>Observer</i>, имитирующий новостной Telegram-канал.
 * <p>
 * Хранит список подписчиков ({@link Observer}) и рассылает им свежие
 * новости ({@link #setLastNews(String)}).
 * </p>
 *
 * @author Краковцев Артём
 * @see Observer
 * @see TelegramUser
 */
public class TelegramChannel implements Channel {

    /**
     * Список подписчиков.
     */
    private final List<Observer> observers;
    /**
     * Последняя(актуальная) новость.
     */
    private String lastNews;

    public TelegramChannel() {
        this.observers = new ArrayList<>();
    }

    /**
     * Обновляет новость и уведомляет всех подписчиков об изменении.
     * @param lastNews
     */
    public void setLastNews(String lastNews) {
        this.lastNews = lastNews;
        notifyObservers();
    }

    /**
     * Добавляет подписчика.
     * @param observer объект, который подписывается на обновления
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Удаляет подписчика.
     * @param observer объект, который подписывается на обновления
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Оповещает всех подписчиков об изменениях.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lastNews);
        }
    }

}

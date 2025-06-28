# Java design patterns

Домашнее задание 1. Реализовать минимум 6 паттернов проектирования.

# Структура

## Каждый шаблон реализован в отдельном пакете и содержит минимум:

- основной код (интерфейсы, реализации);

- демонстрацию (Unit-тесты);

- Javadoc ко всем публичным классам и методам.

# Список реализованных шаблонов

## Поведенческие шаблоны (Behavioral)

### Chain of Responsibility — behavioral.chain

- Обработка заказа через последовательность проверок (вес, ширина, высота).

- Каждый обработчик решает: продолжать или остановиться.

- Пример: HeightHandler, WeightHandler, WidthHandler, Order

### Observer — behavioral.observer

- Реализация Telegram-канала и подписчиков.

- При публикации новости все подписчики получают уведомление.

- Пример: TelegramChannel, TelegramUser

### Memento — behavioral.memento

- Сохранение и восстановление состояния героя игры.

- Используется стек состояний (GameHistory) и снимки (HeroMemento).

- Пример: Hero, HeroMemento, GameHistory

## Структурные шаблоны (Structural)

### Proxy — structural.proxy

- Домофон-прокси проверяет PIN перед делегированием вызова реальной двери.

- Пример: Intercom (proxy), FlatDoor (реальная дверь)

### Composite — structural.composite

- Организация как составной объект, содержащий сотрудников разных ролей.

- Одинаковый интерфейс Employee для листов и композита.

- Пример: Developer, Analyst, Tester, Organization


## Порождающие шаблоны (Creational)

### Prototype — creational.prototype

Клонирование объектов без знания их конкретных классов.

- Каждая фигура реализует интерфейс Figure с методом copy().

- Пример: Circle, Rectangle, Point
package org.ex9.behavioral.chain;

/**
 * Узел цепочки обязанностей, который обеспечивает проверку
 * высоты груза и фиксирует результат работы.
 * @author Краковцев Артём
 */
public class HeightHandler extends Handler {

    /**
     *  При успехе переходит к следующему узлу.
     *  При неудаче фиксирует результат и прерывает цепочку.
     * @param order объект заказа
     * @param logger сборщик сообщений для формирования результата работы цепочки
     */
    @Override
    public void handle(Order order, StringBuilder logger) {
        final int maxHeight = 180;

        if (order.getHeight() <= maxHeight) {
            logger.append("Высота в пределах нормы; ");
            super.handle(order, logger);
        } else {
            logger.append("Высота превышает %d см; ".formatted(maxHeight));
        }
    }

}

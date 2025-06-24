package org.ex9.behavioral.chainOfResponsibility;

/**
 * Узел цепочки обязанностей, который обеспечивает проверку
 * ширины груза и фиксирует результат работы.
 * @author Краковцев Артём
 */
public class WidthHandler extends Handler {

    /**
     *  При успехе переходит к следующему узлу.
     *  При неудаче фиксирует результат и прерывает цепочку.
     * @param order объект заказа
     * @param logger сборщик сообщений для формирования результата работы цепочки
     */
    @Override
    public void handle(Order order, StringBuilder logger) {
        final int maxWidth = 100;

        if (order.getWidth() <= maxWidth) {
            logger.append("Ширина в пределах нормы; ");
            super.handle(order, logger);
        } else {
            logger.append("Ширина превышает %d см; ".formatted(maxWidth));
        }
    }

}

package behavioral;

import org.ex9.behavioral.observer.TelegramChannel;
import org.ex9.behavioral.observer.TelegramUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    @DisplayName("Один подписчик получает новость")
    void oneObserverGetsNews() {
        TelegramChannel channel = new TelegramChannel();
        TelegramUser user = new TelegramUser("Алиса");
        channel.addObserver(user);

        channel.setLastNews("Первый релиз");

        Assertions.assertEquals(
                "Алиса получил новую новость - Первый релиз",
                user.getUpdatesList().getFirst()
        );
        Assertions.assertEquals(1, user.getUpdatesList().size());
    }

    @Test
    @DisplayName("Много подписчиков получают одну новость")
    void manyObserversGetsOneNews() {
        TelegramChannel channel = new TelegramChannel();
        TelegramUser user = new TelegramUser("Алиса");
        channel.addObserver(user);
        TelegramUser user1 = new TelegramUser("Владимир");
        channel.addObserver(user1);
        TelegramUser user2 = new TelegramUser("Светлана");
        channel.addObserver(user2);
        channel.setLastNews("Вторая новость");


        Assertions.assertAll(
                () -> Assertions.assertEquals(1, user.getUpdatesList().size()),
                () -> Assertions.assertEquals(1, user1.getUpdatesList().size()),
                () -> Assertions.assertEquals(1, user2.getUpdatesList().size()),
                () -> Assertions.assertEquals(
                        "Алиса получил новую новость - Вторая новость",
                        user.getUpdatesList().getFirst()
                ),
                () -> Assertions.assertEquals(
                        "Владимир получил новую новость - Вторая новость",
                        user1.getUpdatesList().getFirst()
                ),
                () -> Assertions.assertEquals(
                        "Светлана получил новую новость - Вторая новость",
                        user2.getUpdatesList().getFirst()
                )
        );
    }

    @Test
    @DisplayName("Удалённый пользователь не получает новости")
    void removedObserverNotNotified() {
        TelegramChannel channel = new TelegramChannel();
        TelegramUser user = new TelegramUser("Артём");
        channel.addObserver(user);
        channel.setLastNews("Третья новость");
        channel.removeObserver(user);

        channel.setLastNews("Четвертая новость");

        Assertions.assertEquals(1, user.getUpdatesList().size());
    }

}

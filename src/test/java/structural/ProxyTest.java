package structural;

import org.ex9.structural.Proxy.Door;
import org.ex9.structural.Proxy.FlatDoor;
import org.ex9.structural.Proxy.Intercom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    @DisplayName("Правильный pin открывает дверь")
    void validPin() {

        Door door = new FlatDoor();
        Door proxy = new Intercom(door, "123");

        proxy.open("123");

        Assertions.assertTrue(door.isOpen());

    }

    @Test
    @DisplayName("Неверный pin - дверь закрыта")
    void invalidPin() {

        Door door = new FlatDoor();
        Door proxy = new Intercom(door, "123");

        proxy.open("228");

        Assertions.assertFalse(door.isOpen());

    }

}

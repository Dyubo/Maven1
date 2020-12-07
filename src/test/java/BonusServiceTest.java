import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void ShouldCalculateRegisteredAndUnderLimited() {
        BonusService service = new BonusService();
        // подготавливаем данные:

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateRegisteredAndOverLimited() {
        BonusService service = new BonusService();
        // подготавливаем данные:

        long amount = 5000_60;
        boolean registered = true;
        long expected = 150;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void ShouldCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:

        long amount = 15500555_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}



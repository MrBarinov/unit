package seminars.fourth.card;

import org.junit.jupiter.api.*;

import static org.mockito.Mockito.*;

class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты
     * для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`,
     * `getCardHolder()`, `getExpiryDate()`, `getCvv()`,
     * `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект
     * в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает
     * метод `charge()`
     */

    @Test
    void paymentFormTest() {
        CreditCard card = mock(CreditCard.class);
        when(card.getCardNumber()).thenReturn("1234567890");
        when(card.getCardHolder()).thenReturn("Nikita Petrov");
        when(card.getExpiryDate()).thenReturn("01/2025");
        when(card.getCvv()).thenReturn("003");

        PaymentForm pf = new PaymentForm(card);
        pf.pay(100d);

        verify(card, times(1)).charge(100);
    }
}
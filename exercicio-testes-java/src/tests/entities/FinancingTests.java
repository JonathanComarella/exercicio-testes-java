package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setIncome(5000.0);

        Assertions.assertEquals(5000.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setIncome(1200.0);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.setMonths(90);

        Assertions.assertEquals(90, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setMonths(10);
        });
    }

    @Test
    public void entryShouldSetDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.entry();

        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldSetDataWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);
        financing.quota();

        Assertions.assertEquals(1000.0, financing.quota());
    }
}

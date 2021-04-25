import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCalculator {
  @Test
  public void testMonthPayment() {
    Calculator calculator = new Calculator();
    double sum = 100000;
    double rate = 10;
    int monthNum = 10;
    double result = calculator.monthPayment(sum, rate, monthNum);
    assertTrue("Неверный ежемесячный платеж " + result + " <> 10464.04", result == 10464.04);
  }

  @Test
  public void testAllSum() {
    Calculator calculator = new Calculator();
    double sum = 100000;
    double rate = 10;
    int monthNum = 10;
    double result = calculator.allSum(sum, rate, monthNum);
    assertTrue("Неверная общая сумма к возврату " + result + " <> 104640.40", result == 104640.40);
  }

  @Test
  public void testOverpayment() {
    Calculator calculator = new Calculator();
    double sum = 100000;
    double rate = 10;
    int monthNum = 10;
    double result = calculator.overpayment(sum, rate, monthNum);
    assertTrue("Неверная переплата за весь период " + result + " <> 4640.40", result == 4640.40);
  }
}

public class Calculator {
  public double monthPayment(double sum, double rate, int monthNum) {
    /* Расчет месячного платежа
    A = S * (r + r / (((1+r)^n)-1))
    , A – ежемесячный аннуитетный платеж
      S – сумма кредита
      r – месячная процентная ставка по кредиту (годовая ставка деленная на 12 месяцев)
      n – количество периодов (месяцев), в течение которых выплачивается кредит
    */
    double r = rate / 12 / 100;
    return round(sum * (r + r / (Math.pow((1 + r), monthNum) - 1)));
  }

  // Расчет общей суммы к возврату в банк
  public double allSum(double sum, double rate, int monthNum) {
    return round(monthPayment(sum, rate, monthNum) * monthNum);
  }

  // Расчет переплаты за весь период
  public double overpayment(double sum, double rate, int monthNum) {
    return round(allSum(sum, rate, monthNum) - sum);
  }

  // Округление до 2х знаков
  public double round(double d) {
    return Math.ceil(d * 100) / 100;
  }
}

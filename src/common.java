public class common {
  public long LCM(int[] x) {
    return getLCM(x);
  }

  private long getLCM (int[] x) {
      long lcm_of_array_elements = 1;
      int divisor = 2;
          while (true) {
            int counter = 0;
            boolean divisible = false;
              for (int i = 0; i < x.length; i++) {
                if (x[i] == 0) {
                  return 0;
                }else if (x[i] < 0) {
                  x[i] = x[i] * (-1);
                }
                if (x[i] == 1) {
                  counter++;
                }
                if (x[i] % divisor == 0) {
                  divisible = true;
                  x[i] = x[i] / divisor;
                }
              }
                if (divisible) {
                  lcm_of_array_elements = lcm_of_array_elements * divisor;
                }else {
                  divisor++;
                }
                  if (counter == x.length) {
                    return lcm_of_array_elements;
                  }
          }
  }

  public int GCD(int[] x) {
      return getGCD(x);
  }

  public double GCD(double[] x) {
      return getGCD(x);
  }

  private double getGCD (double[] x) {
    double result = x[0];
      for (int i = 1; i < x.length; i++)
        result = gcd(x[i], result);
      return result;
  }

  private double gcd (double a, double b) {
    if (a == 0)
      return b;
    return gcd(b%a, a);
  }

  private int getGCD (int[] x) {
    int result = x[0];
      for (int i = 1; i < x.length; i++)
        result = gcd(x[i], result);
      return result;
  }

  private int gcd (int a, int b) {
    if (a == 0)
      return b;
    return gcd(b%a, a);
  }
}

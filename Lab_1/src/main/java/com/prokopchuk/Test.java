package com.prokopchuk;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class Test {

  private static BigInteger factorial(int n) {
    BigInteger result = BigInteger.ONE;

    for (int i = 2; i <= n; i++) {
      result = result.multiply(BigInteger.valueOf(i));
    }

    return result;
  }

  private static int inverse(BigInteger factorialValue) {
    int low = 1;
    int high = 2000;

    while (low <= high) {
      int mid = (low + high) / 2;
      BigInteger currentFactorial = factorial(mid);

      int compareResult = Objects.compare(factorialValue, currentFactorial, BigInteger::compareTo);

      if (compareResult == 0) {
        return mid;
      }

      if (compareResult < 0) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }



  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String toInverse = scanner.next();
      System.out.println(inverse(new BigInteger(toInverse)));
    }
  }

}

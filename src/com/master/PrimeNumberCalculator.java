package com.master;

import java.util.stream.IntStream;

class PrimeNumberCalculator {

    private final int FIRST_PRIME_NUMBER = 2;

    int getTotalOfAddingPrimeNumbersFrom0To(int maximumPrimeNumber) {
        return IntStream.range(FIRST_PRIME_NUMBER, maximumPrimeNumber).filter(this::isPrimeNumber).sum();
    }

    int getTotalOfAddingFirstMaxPrimeNumbers(int totalPrimeNumber) {
        int primeNumberCount = 0;
        int currentNumber = FIRST_PRIME_NUMBER;
        int result = 0;
        while (primeNumberCount < totalPrimeNumber) {
            if (isPrimeNumber(currentNumber)) {
                result += currentNumber;
                primeNumberCount++;
            }
            currentNumber++;
        }
        return result;
    }

    private boolean isPrimeNumber(int number) {
        for (int i = FIRST_PRIME_NUMBER; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(number + " es primo.");
        return true;
    }
}

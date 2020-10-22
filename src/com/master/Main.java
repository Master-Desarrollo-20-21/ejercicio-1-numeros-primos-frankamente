package com.master;

public class Main {

    public static void main(String[] args) {
        final int maximumPrimeNumber = 50;
        final PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        int totalOfAddingPrimeNumbersFrom0ToMaximumPrimeNumber =
                primeNumberCalculator.getTotalOfAddingPrimeNumbersFrom0To(maximumPrimeNumber);
        System.out.println(totalOfAddingPrimeNumbersFrom0ToMaximumPrimeNumber);
        int totalOfAddingTheFirstMaximumPrimeNumber = primeNumberCalculator.getTotalOfAddingFirstMaxPrimeNumbers(maximumPrimeNumber);
        System.out.println(totalOfAddingTheFirstMaximumPrimeNumber);
    }
}

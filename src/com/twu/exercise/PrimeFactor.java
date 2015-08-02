package com.twu.exercise;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> generate(int number) {
        List<Integer> primeFactors = new LinkedList<>();
        generatePrimeFactor(number, 2, primeFactors);
        return primeFactors;
    }

    private void generatePrimeFactor(int number, int index, List<Integer> primeFactors) {
        int res;
        for (int i = index; i <= number; ++i) {
            if(number % i == 0) {
                primeFactors.add(i);
                res = number / i;
                if(res == 1) {
                    return;
                } else {
                    generatePrimeFactor(res, i, primeFactors);
                    break;
                }
            }
        }
    }
}

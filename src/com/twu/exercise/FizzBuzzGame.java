package com.twu.exercise;

public class FizzBuzzGame {

    public void fizzBuzz(int start, int end) {
        for (int i = start; i <= end; ++i) {
            System.out.println(fizzOrBuzz(i));
        }
    }

    private String fizzOrBuzz(int n) {
        String result = "";
        if(n % 3 == 0) {
            result += "Fizz";
        }
        if(n % 5 == 0) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(n) : result;
    }
}

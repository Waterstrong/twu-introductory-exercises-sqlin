package com.twu.exercise;


import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        TriangleDiamond triangleDiamond = new TriangleDiamond();
        triangleDiamond.drawAsterisk();
        printSplitLine();
        triangleDiamond.drawHorizontalLine(8);
        printSplitLine();
        triangleDiamond.drawVerticalLine(3);
        printSplitLine();
        triangleDiamond.drawRightTriangle(3);
        printSplitLine();

        triangleDiamond.drawIsoscelesTriangle(3);
        printSplitLine();

        triangleDiamond.drawCenteredDiamond(3);
        printSplitLine();

        triangleDiamond.drawCenteredDiamondWithName(3, "Bill");
        printSplitLine();

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.fizzBuzz(1, 15);
        printSplitLine();

        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> primeFactors = primeFactor.generate(30);
        printIntegerList(primeFactors);


        printSplitLine();
    }

    private static void printIntegerList(List<Integer> primeFactors) {
        for (Integer pf : primeFactors) {
            System.out.print(pf + " ");
        }
        System.out.println();
    }

    private static void printSplitLine() {
        System.out.println("---------华丽丽的分割线-----------");
    }
}

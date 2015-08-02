package com.twu.exercise;

public class TriangleDiamond {

    private void printAsterisk() {
        System.out.print("*");
    }

    public void drawAsterisk() {
        printAsterisk();
        System.out.println();
    }

    public void drawHorizontalLine(int n) {
        printHorizontalLine(n);
        System.out.println();
    }

    private void printHorizontalLine(int n) {
        for (int i = 0; i < n; ++i) {
            printAsterisk();
        }
    }

    public void drawVerticalLine(int n) {
        for (int i = 0; i < n; ++i) {
            printAsterisk();
            System.out.println();
        }
    }

    public void drawRightTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            drawHorizontalLine(i + 1);
        }
    }

    public void drawIsoscelesTriangle(int n) {
        printIsoscelesTriangle(n);
        drawHorizontalLine(2 * n - 1);
    }

    private void printIsoscelesTriangle(int n) {
        for (int i = 0; i < n - 1; ++i) {
            printCenteredCurrentLine(n, i);
        }
    }

    private void printReverseIsoscelesTriangle(int n) {
        for (int i = n - 2; i >= 0; --i) {
            printCenteredCurrentLine(n, i);
        }
    }

    private void printCenteredCurrentLine(int n, int i) {
        int currentLineLength = 1 + i * 2;
        int halfBlankSpaceSize = n - i - 1;
        printBlankSpace(halfBlankSpaceSize);
        printHorizontalLine(currentLineLength);
        printBlankSpace(halfBlankSpaceSize);
        System.out.println();
    }

    private void printBlankSpace(int size) {
        for (int j = 0; j < size; ++j) {
            System.out.print(" ");
        }
    }

    public void drawCenteredDiamond(int n) {
        drawIsoscelesTriangle(n);
        printReverseIsoscelesTriangle(n);
    }

    public void drawCenteredDiamondWithName(int n, String name) {
        printIsoscelesTriangle(n);
        System.out.println(name);
        printReverseIsoscelesTriangle(n);
    }
}

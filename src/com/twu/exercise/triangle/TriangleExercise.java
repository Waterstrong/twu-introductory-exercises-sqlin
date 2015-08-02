package com.twu.exercise.triangle;

public class TriangleExercise {

    private void printAsterisk() {
        System.out.print("*");
    }

    public void drawAsterisk() {
        printAsterisk();
        System.out.println();
    }

    public void drawHorizontalLine(int n) {
        for (int i = 0; i < n; ++i) {
            printAsterisk();
        }
        System.out.println();
    }

    public void drawVerticalLine(int n) {
        for(int i = 0; i < n; ++i) {
            printAsterisk();
            System.out.println();
        }
    }

    public void drawRightTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            drawHorizontalLine(i+1);
        }
    }
}

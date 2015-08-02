package com.twu.exercise;

import com.twu.exercise.triangle.TriangleExercise;

public class ApplicationRunner {
    public static void main(String[] args) {
        TriangleExercise triangle = new TriangleExercise();
        triangle.drawAsterisk();
        printSplitLine();
        triangle.drawHorizontalLine(8);
        printSplitLine();
        triangle.drawVerticalLine(3);
        printSplitLine();
        triangle.drawRightTriangle(3);
        printSplitLine();

    }

    private static void printSplitLine() {
        System.out.println("---------华丽丽的分割线-----------");
    }
}

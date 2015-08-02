package com.twu.exercise;


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
    }

    private static void printSplitLine() {
        System.out.println("---------华丽丽的分割线-----------");
    }
}

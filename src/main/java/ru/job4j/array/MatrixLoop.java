package ru.job4j.array;

public class MatrixLoop {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                result += anInt;
            }
        }
        return result;
    }
}

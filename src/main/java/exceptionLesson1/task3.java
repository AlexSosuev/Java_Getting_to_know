package exceptionLesson1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. Необходимо посчитать и вернуть
// сумму элементов этого массива. При этом накладываем на метод 2 ограничения: метод может работать только с квадратными
// массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. Если нарушается
// одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

import java.util.List;
import java.util.stream.IntStream;

public class task3 {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 0},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}

        };
        System.out.println(matrixSum(ints));
    }

    public static int matrixSum(int[][] matrix) {
        if (isNotSquer(matrix)) {
            throw new RuntimeException("Not Squer Array");
        }else if (isNotOneOrZero(matrix)){
            throw new RuntimeException("Has to contain One or Zero");
        }
        int sum = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

    public static boolean isNotOneOrZero(int[][]matrix){
        List<Integer>  container = List.of(0,1);
        return IntStream.range(0, matrix.length)
                .anyMatch(i -> IntStream.range(0, matrix.length)
                        .anyMatch(j -> !container.contains(matrix[i][j])));
    }

    public static boolean isNotSquer(int[][] matrix) {
        for (int[] ints : matrix) {
            if (ints.length != matrix.length) {
                return true;
            }
        }
        return false;
    }
}
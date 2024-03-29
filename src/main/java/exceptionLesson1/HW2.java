package exceptionLesson1;

import java.util.Arrays;

class Answer1 {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if(a == null || b == null || a.length != b.length){
            return new int[1]; // нулевой массив длины 1 будет означать различие в длине массивов
        }
        else{
            int[] c = new int[a.length];
            for(int i = 0; i < a.length; i++){
                c[i] = a[i] - b[i];
            }
            return c;
        }
    }
}

public class HW2 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3, 3};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer1 ans = new Answer1();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
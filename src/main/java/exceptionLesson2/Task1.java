package exceptionLesson2;

import java.util.Arrays;
import java.util.Scanner;

// Изучите данный код. Все ли с ним хорошо? Если нет, скорректируйте код, попробуйте обосновать свое решение.
public class Task1 {

    private static int i=0;
    public static void main(String[] args) {
        run();
    }

    private static void test(){
        while (true){
            i+=1_000_000_000;
            test();
        }
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        try {
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                arr[index] = 1;
                System.out.println(Arrays.toString(arr));
              //  test();
            }else{
                System.out.println("Введено не число!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Указан индекс за пределами массива");
        } finally {
            System.out.println("Выполнится влюбом случае....");
        }
    }
}
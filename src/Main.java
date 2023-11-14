import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {

        //Random array
        Random random = new Random();
        int[] arrayOne = new int[30];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(100_000) + 100_000;
        }
        return arrayOne;
    }

    // 1
    public static void task1() {
        int[] arrayOne = generateRandomArray();
        int zarplataMount = 0;
        int[] randomZarlataGenerate = generateRandomArray();
        for (int i = 0; i < 30; i++) {
            zarplataMount = zarplataMount + randomZarlataGenerate[i];
//            System.out.println(zarplataMount);
        }

        System.out.println(" «Сумма трат за месяц составила " + zarplataMount + " рублей");
    }

//    2

    public static void task2() {
        int zarplataMountMax = 0;
        int zarplataMountMin = 0;
        int[] randomZarlataGenerate = generateRandomArray();
        for (int i = 0; i < 30; i++) {
            if (randomZarlataGenerate[i] > zarplataMountMax) {
                zarplataMountMax = randomZarlataGenerate[i];
            } else if (randomZarlataGenerate[i] < zarplataMountMin) {
                zarplataMountMin = randomZarlataGenerate[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + zarplataMountMin + " рублей. Максимальная сумма трат за день составила " + zarplataMountMax + " рублей»");
    }

    // 3
    public static void task3() {
        int zarplataMonth = 0;
        double zarplataMiddle = 0;
        int[] zarplata = generateRandomArray();
        for (int i = 0; i < 30; i++) {
            zarplataMonth += zarplata[i];
        }
        zarplataMiddle = (double) zarplataMonth / 30;
        System.out.println("Средняя сумма трат за месяц составила " + zarplataMonth + " рублей");
    }


    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}
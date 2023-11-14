import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
    }

    public static int[] generateRandomArray() {

        //Random array
        Random random = new Random();
        int [] arrayOne = new int[30];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(100_000) + 100_000;
        }
        return arrayOne;
    }

    public static void task1(){
        int [] arrayOne = generateRandomArray();
        int zarplataMount = 0;
        int [] randomZarlataGenerate = generateRandomArray();
        for (int i = 0; i < 30; i++) {
            zarplataMount = zarplataMount + randomZarlataGenerate[i];
//            System.out.println(zarplataMount);
        }

        System.out.println(" «Сумма трат за месяц составила " + zarplataMount + " рублей");
    }


//    public static void task2(){
//        int [] arrayOne = generateRandomArray();
//    }
//
//    public static void task3(){
//        int [] arrayOne = generateRandomArray();
//    }

    public static void task4(){
        int [] arrayOne = generateRandomArray();
    }

}
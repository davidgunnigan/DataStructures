package other;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Shuffle {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        shuffle(array);
        System.out.println(Arrays.toString(array));

        sumNumsInArray(1000);
    }


    public static void shuffle(int[] array) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < array.length; i++) {
            int randomNum = random.nextInt(array.length);
            int tmp = array[i];
            array[i] = array[randomNum];
            array[randomNum] = tmp;
        }
    }

    public static void sumNumsInArray(int x) {
        int[] array = new int[50];
        int sum = 0;
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(x);
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

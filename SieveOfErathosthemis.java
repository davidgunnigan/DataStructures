package other;

public class SieveOfErathosthemis {
    public static void main(String[] args) {
        boolean[] array = new boolean[100];

        for (int i = 2; i < array.length; i++) {
            array[i] = true;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                for (int j = 2; j < array.length; ++j) {
                    int nextMultiple = i * j;
                    if (nextMultiple > array.length - 1) {
                        break;
                    } else {
                        array[nextMultiple] = false;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                System.out.println(i);
            }
        }
    }
}

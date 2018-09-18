package other;

public class Arrays1 {
    public static void main(String[] args) {
        int[][] rows = new int[4][5];
        int counter = 1;
        for (int i = 0; i < rows.length; i++) {
            int[]innerArray = rows[i];
            for (int j = 0; j < innerArray.length; j++) {
                rows[i][j] = counter++;
            }
        }
        printIntegerArray(rows);
    }

    public static void printIntegerArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[]innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}

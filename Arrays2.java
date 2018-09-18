package other;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] rows = new int[4][3];
        int counter = 12;
        for(int i = rows.length; i > 0; i--) {
            int[] position = rows[i];
            for (int j = position.length; j > 0; j--) {
                rows[i][j] = counter--;
            }
            Arrays1.printIntegerArray(rows);
        }
    }
}

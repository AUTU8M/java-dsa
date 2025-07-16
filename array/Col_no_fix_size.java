public class Col_no_fix_size {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2},
                {1, 4, 56}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

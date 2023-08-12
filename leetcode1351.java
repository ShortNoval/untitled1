public class leetcode1351 {
    public static int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            int left = 0;
            int right = row.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (row[mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            count += row.length - left;
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };

        int result = countNegatives(grid);
        System.out.println(result);  // 输出 8
    }
}

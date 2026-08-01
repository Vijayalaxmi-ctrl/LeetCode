class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for(int row = 0 ; row < matrix.length ; row++) {
            int minCol = 0;

            for(int col = 0 ; col < matrix[0].length ; col++) {
                if(matrix[row][col] < matrix[row][minCol]) {
                    minCol = col;
                }
            }

            boolean lucky = true;
            for(int j = 0; j < matrix.length ; j++) {
                if(matrix[j][minCol] > matrix[row][minCol]) {
                    lucky = false;
                    break;
                }
            }

            if(lucky) {
                arr.add(matrix[row][minCol]);
            }
        }
        return arr;

    }
}
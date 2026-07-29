class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image.length];
        int k = 0;
        for(int i = 0; i < image.length ; i++) {
            for(int j = image[i].length-1 ; j >= 0 ; j--) {
                arr[i][k] = image[i][j];
                k++;
            } 
            k=0;
        }
        for(int i = 0; i < image.length ; i++) {
            for(int j = 0 ; j< image.length ; j++) {
                if(arr[i][j] == 0){
                    arr[i][j] =1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
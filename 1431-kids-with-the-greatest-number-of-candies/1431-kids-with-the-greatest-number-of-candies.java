class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length ; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        int sum = 0;
        for(int i = 0 ; i < candies.length ; i++) {
            sum =  candies[i] + extraCandies;
            if(sum >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
        // int i = 0;
        //     int sum = candies[i] + extraCandies;
        //     int m = 0;
        //     int  k = 0;
        //     while(sum >= m) {
        //         if(candies[k] < m) {
        //             k++;
        //         }
        //         else {
        //             m = candies[k];
        //             k++;
        //         }
        //         list.add(true);
        //     }
        //     i++;
        //     list.add(false);
        // return list;
        }
        
    }

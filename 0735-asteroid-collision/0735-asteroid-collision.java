
import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> st = new ArrayList<>();

        for (int i = 0; i < asteroids.length; i++) {

            int curr = asteroids[i];
            boolean alive = true;

            if (curr > 0) {
                st.add(curr);
            } 
            else {
                while (!st.isEmpty() && st.get(st.size() - 1) > 0
                        && st.get(st.size() - 1) < Math.abs(curr)) {
                    st.remove(st.size() - 1);
                }

                if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(curr)) {
                    st.remove(st.size() - 1);
                    alive = false;
                }
                else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(curr);
                }
                else {
                    alive = false;
                }
            }
        }

        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}

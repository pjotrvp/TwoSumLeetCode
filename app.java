import java.util.ArrayList;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        int jIndex = -1;
        int iIndex = -1;
        for (int i : nums) {
            iIndex++;
            for (int j : nums) {
                jIndex++;
                if (iIndex != jIndex && i + j == target) {
                    indexes[0] = iIndex;
                    indexes[1] = jIndex;
                    break;
                }

            }
            jIndex = -1;
        }
        return indexes;
    }
}

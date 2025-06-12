public class MaxDifference_3423 {
    public static void main(String[] args){
        int[] numb={3,2,-5,-3};
        Solution3423 sl = new Solution3423();
        System.out.print(sl.maxAdjacentDistance(numb));
    }
}
class Solution3423 {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums[i] - nums[(i + 1) % n]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}
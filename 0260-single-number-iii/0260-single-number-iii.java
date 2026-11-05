class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;

        for (int num : nums) {
            xor = xor ^ num;
        }

     
        int bit = xor & (-xor);

        int a = 0;
        int b = 0;

       
        for (int num : nums) {

            if ((num & bit) == 0) {
                a = a ^ num;
            } else {
                b = b ^ num;
            }
        }

        return new int[]{a, b};
    }
}
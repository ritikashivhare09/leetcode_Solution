class Solution {
    public int[] plusOne(int[] digits) {
        int size=digits.length;

        int carry=1;

        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }

        if(carry!=0){
            size++;
        }

        int ans[]=new int[size];
        int j=0;
        int i=0;

        if(carry!=0){
            ans[j]=carry;
            j++;
        }

        while(j<size){
            ans[j]=digits[i];
            i++;
            j++;
        }

        return ans;

    }
}
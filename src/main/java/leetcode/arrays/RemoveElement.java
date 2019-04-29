package leetcode.arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement2(nums,2)+"");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+"");
        }

    }
    private static int removeElement(int[] nums, int val) {

        int i=0;
        int n = nums.length;
        while (i<n){
            if (nums[i]==val){
                nums[i] = nums[n-1];
                n--;
            }else {
                i++;
            }
        }

        return n;
    }

    private static int removeElement2(int[] nums,int val){
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }

}

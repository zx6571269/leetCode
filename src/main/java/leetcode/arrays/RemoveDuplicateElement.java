package leetcode.arrays;

public class RemoveDuplicateElement {


    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
        int i = removeElement(nums);
        System.out.println(i);

    }

    public static int removeElement(int[] nums){
        int j =0;
        for (int i = 1; i < nums.length ; i++) {

            if (nums[i] != nums[j]){
                j++;
                nums[j]=nums[i];
            }

        }
        return j+1;
    }
}

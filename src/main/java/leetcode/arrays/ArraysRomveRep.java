package leetcode.arrays;

/**
 * Created by Administrator on 2018/10/18.
 */
public class ArraysRomveRep {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};


        int j = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            System.out.println("i:"+nums[i]);
            System.out.println("j:"+nums[j]);
            if (nums[i] != nums[j])
                nums[++j] = nums[i];
        }

        System.out.println(j+1);
        for (int i = 0; i <j+1 ; i++) {
            System.out.print(nums[i]);
        }

    }
}

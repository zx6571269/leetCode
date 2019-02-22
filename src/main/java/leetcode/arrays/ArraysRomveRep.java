package leetcode.arrays;

/**
 * . 删除排序数组中的重复项
 *
 * 给定数组 nums = [1,1,2],

 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

 你不需要考虑数组中超出新长度后面的元素。

 示例 2:

 给定 nums = [0,0,1,1,1,2,2,3,3,4],

 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

 你不需要考虑数组中超出新长度后面的元素。

 */
public class ArraysRomveRep {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};


        int j = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            System.out.println("i:"+nums[i]);
            System.out.println("j:"+nums[j]);
            if (nums[i] != nums[j]){
                nums[++j] = nums[i];
            }

        }

        System.out.println(j+1);
        for (int i = 0; i <j+1 ; i++) {
            System.out.print(nums[i]);
        }

    }
}

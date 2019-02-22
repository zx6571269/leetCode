package leetcode.arrays;

/**
 * @Author: zeng xin
 * @Date: 2019/2/21 14:29
 * @Version 1.0
 */
import java.util.HashMap;
import java.util.Map;
/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 示例:
 给定 nums = [2, 7, 11, 15], target = 9
 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]

 */
public class TowSum {
    //暴力法
    private static int[] towSum(int[] nums,int target){
        int[] index=new int[2];
        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(num==nums[j]){
                        index[0]=i;
                        index[1]=j;
                        return  index;
                    }
                }

            }
        }
        return index;
    }

    //利用空间换取时间
    private static int[] towSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>(12);

        //将数组值作为key,index作为value，数据结构变为：(25,1),(5,2)....
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i <nums.length ; i++) {
            int element = target - nums[i];
            // map.get(element)!=i 通过
            if (map.containsKey(element) && map.get(element)!=i){
                return new int[]{i,map.get(element)};
            }
        }

         throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,3};
        int target = 6;
        int[] indexs = towSum2(nums,target);
        for (int i = 0; i <indexs.length ; i++) {

            System.out.print(indexs[i]+",");
        }
    }
}

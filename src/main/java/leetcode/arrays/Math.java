package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/20.
 */
public class Math {
    public int algar(){
        int a = 1;
        int b = 2;
        int c = (a+b)*20;
        return  c;
    }

    public static void main(String[] args) {

        Math math = new Math();
        int num = math.algar();
        Map<String,String> map = new HashMap<String, String>();

        map.put("aa","bbb");


        System.out.println(num);

    }
}

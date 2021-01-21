package example.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
//        public int[] twoSum(int[] nums, int target) {
        int sum[] = {2, 7, 11, 5};
//            int[] abb = new int[2];
        int target = 18;

        //如果要判断数组中两数之和等于目标值
        //穷举循环
//            for(int i=0;i<sum.length-1;i++){
//                for(int j=i+1;j<sum.length;j++){
//                    if(sum[i]+sum[j] ==target){
//                        abb[0] =i;
//                        abb[1] =j;
//                        System.out.println("abb[0]:"+i);
//                        System.out.println("abb[1]:"+j);
//                    }
//                }
//            }

        //HashMap循环
//            Map<Integer,Integer> map = new HashMap<>(sum.length);
//            for(int i=0;i<sum.length;i++){
//
//                int value = target-sum[i];
//                Integer index = map.get(value);
//                if(index!=null && index!=i){
//                    abb[0]=i;
//                    abb[1]=index;
//                    break;
//                }
//                map.put(abb[i],i);
//                System.out.println("abb[i]:"+abb[i]+"-i:"+i);
//            }


        int[] ints = TwoSum.twoSum(sum, target);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] twoSum(int[] sum, int target) {
//            int[] sum = {2,7,11,5};
        int[] abb = new int[2];
        Map<Integer, Integer> map = new HashMap<>(sum.length);
        for (int i = 0; i < sum.length; i++) {

            int value = target - sum[i];
            Integer index = map.get(value);
            if (index != null && index != i) {
                abb[0] = i;
                abb[1] = index;
                break;
            }
            map.put(sum[i], i);
        }
        return abb;
    }
}

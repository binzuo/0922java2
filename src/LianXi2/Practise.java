package LianXi2;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/9/22 0022.
 */
public class Practise {
    public static void main(String[] args) {
        int[] scores1={88,81,74,68,78,76,77,85,95,93};
        int[] scores2= Arrays.copyOf(scores1,scores1.length);
        for (int score:scores2){
            System.out.println(score);
        }
    }
}

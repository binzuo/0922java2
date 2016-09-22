package LianXi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/9/22 0022.
 */
public class Group {
    public static void main(String[] args) {
       //int[] scores={88,81,74,68,78,76,77,85,95,93};
       //for(int i=0;i<scores.length;i++){
          // System.out.println("学生分数:"+scores[i]);

       //}
        //scores[3]=100;
        //for (int score:scores){
            //System.out.println("学生分数："+score);
        //}
        //scores[3]=100;
        //System.out.println(scores[3]);
        int[] scores=new int[10];
        for (int score:scores){
            System.out.println(score);
        }
        Arrays.fill(scores, 60);
        for (int score:scores){
            System.out.println(score);
        }


    }
}

package LianXi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/22 0022.
 */
public class SecondGroup {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        //int[][]cords={
        //{1,2,3},
        //{4,5,6}

        //};
        arr[0] = new int[]{1, 2, 3, 4, 5};
        arr[1] = new int[]{1, 2, 3,};

        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.println(arr[x][y]);


                //System.out.print();
            }
        }
        int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length * 2);
        //scores2[0]=100;

        for (int score : scores2) {
            System.out.println(score);
        }
        //for (int score:scores1){
        //System.out.println(score);
        //}


       // Scanner scanner = new Scanner(System.in);
        //long sum = 0;
        //long number = 0;
        //do {
            //System.out.println("输入数字：");
            //number = Long.parseLong(scanner.next());
            //sum += number;
        //}
        //while (number != 0);
        //System.out.println("总和："+sum);
        //int i1=900;
        //int i2=900;
        //if (i1==i2){
            //System.out.println("x==y");
        //}
        //else {
            //System.out.println("x!=y");
       // }
        int x=200;
        int y=200;
        Integer wx=x;
        Integer wy=y;
        System.out.println(x==wx);
        System.out.println(y==wy);
        int[] arr1={1,2,3};
        int[] arr2=new int[arr1.length];
        arr2=arr1;
        for (int value:arr2){
            System.out.println(value);
        }



    }
}

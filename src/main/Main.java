package main;

import java.util.Arrays;

public class Main {
    //冒泡排序算法
    private static void bubbleSort(int numbers[]){
        int len = numbers.length;
        long begin = System.currentTimeMillis();
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
                if(numbers[j-1] > numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        long time = end - begin;
        System.out.println("冒泡排序总耗时：" + time);
    }

    public static void main(String []args){
        int len = 10000;
        int numbers[] = new int[len];
        for(int i=0;i<len;i++){
            numbers[i] = (int) (Math.random() * len * 10 + 1);
            if(i != len-1){
                System.out.print(numbers[i] + " ");
                continue;
            }
            System.out.println(numbers[i]);
        }

        bubbleSort(numbers);

        for(int i=0;i<len;i++){
            if(i != len-1){
                System.out.print(numbers[i] + " ");
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}

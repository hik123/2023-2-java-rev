package com.green.second.ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = MyArray.make(3);
        System.out.println(arr.length);

        MyArray.inputStart(arr, 8); //arr 배열의 0번방에 8값부터 넣기
            // [0]=8, [1]=9, [2]=10, [3]=11
        System.out.println(Arrays.toString(arr));
        int[] arr2 =MyArray.mapSum(arr, 3); //기존 배열의 각 방의 값을 +3한 새로운 배열을 리턴
        System.out.println(Arrays.toString(arr2));
        int[] arr3 =MyArray.mapSum(arr, 5); //기존 배열의 각 방의 값을 +5한 새로운 배열을 리턴
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr));

        int sum = MyArray.sum(arr2); //배열 각 방의 값을 모두 더한 값 리턴
        System.out.println("sum: " + sum);

        int[] arr4 = { 10, 2, 1, 9, 13 };
        int min = MyArray.min(arr4); //배열안에서 가장 작은 값을 리턴할 수 있도록
        System.out.println(min);
        int max = MyArray.max(arr4);
        System.out.println(max);

        MyArray.shuffle(arr4); //배열값 랜덤하게 섞기
        System.out.println(Arrays.toString(arr4));
    }
}

class MyArray {
    public static int[] make(int len) {
        return new int[len];
    }

    public static void inputStart(final int[] arr, final int starNum) {
        int num = starNum;
        for(int i=0; i<arr.length; i++) {
            arr[i] = num++;
        }
    }
    public static int[] mapSum(int[] arr, int num) {
        int[] tmp = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            tmp[i] = arr[i]+num;
        }
        return tmp;
    }
    public static int sum (int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int min(int[] arr) {
        int min = 13;
        for (int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr) {
        int max = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    /*
    public static void shuffle(int[] arr) {
        int tmp = 0;
        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length);
            tmp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = tmp;
        }
    }*/
    public static void shuffle(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length);
            if(i == rIdx) { continue; }
            int tmp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = tmp;
        }
    }
}

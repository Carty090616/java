/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: QuickSort
 * Author:   Lifeifei
 * Date:     2018/12/26 15:59
 * Description: 快速排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;

/**
 * 〈快速排序〉
 *
 * @author Lifeifei
 * @create 2018/12/26
 * @since 1.0.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arrays = {33, 11, 22, 44, 66, 77, 99, 55, 88, 87, 94, 25, 36, 45, 12, 37, 15, 14};
        System.out.println("未排序数组是: " + Arrays.toString(arrays));
        sort(arrays, 0, arrays.length - 1);
        System.out.println("最终排序数组: " + Arrays.toString(arrays));
    }

    public static void sort(int[] arr, int low, int high){
        int start = low;
        int end = high;
        // 获取第一个元素，用作“基准”
        int key = arr[low];

        while(end > start){
            // 从后往前比较
            while(end > start && arr[end] >= key) {  // 如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            }
            if(arr[end] <= key){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            System.out.println("从后往前比较: " + Arrays.toString(arr));
            // 从前往后比较
            while(end > start && arr[start] <= key) { // 如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            }
            if(arr[start] >= key){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            System.out.println("从前往后比较: " + Arrays.toString(arr));
            // 此时第一次循环比较结束，关键值（基准）的位置已经确定了（基准已经处于排序正确的位置）。
            // 左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        // 递归--对左右序列进行排序
        if(start > low)
            sort(arr, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if(end < high)
            sort(arr, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }


}
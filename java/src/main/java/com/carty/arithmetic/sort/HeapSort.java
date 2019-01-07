/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: HeapSort
 * Author:   Lifeifei
 * Date:     2018/12/26 17:08
 * Description: 堆排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 〈堆排序〉
 *
 * @author Lifeifei
 * @create 2018/12/26
 * @since 1.0.0
 */
public class HeapSort {

    public static void main(String[] args) {

        int count = 10;

        int[] A = new int[count];
        Random random = new Random();
        for (int i = 0 ; i < count ; i++) {
            A[i] = random.nextInt(100);
        }
        System.out.println("Input: " + Arrays.toString(A));
        System.out.println("start: " + System.currentTimeMillis());
        sort(A);
        System.out.println("Output: " + Arrays.toString(A));
        System.out.println("end: " + System.currentTimeMillis());
    }

    public static void sort(int []arr){
        // 1.构建大顶堆
        // arr.length / 2 - 1 计算出的值到0之间都是非叶子节点
        for(int i = arr.length / 2 - 1 ; i >= 0 ; i--){
            // 从第一个非叶子结点从下至上，从右至左调整结构
            // 第一次循环时，i 指的是第一个非叶子结点
            adjustHeap(arr, i, arr.length);
        }
        // 2.调整堆结构 + 交换堆顶元素与末尾元素
        System.out.println("bbbbb: " + Arrays.toString(arr));
        for(int j = arr.length - 1 ; j > 0 ; j--){
            // 将堆顶元素与末尾元素进行交换
            swap(arr, 0, j);
            // 重新对堆进行调整（自上至下）
            adjustHeap(arr, 0, j);
        }

    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr, int i, int length){
        // 先取出当前元素i
        int temp = arr[i];
        // 从i结点的左子结点开始，也就是2i+1处开始
        for(int k = i * 2 + 1 ; k < length ; k = k * 2 + 1){
            // 如果左子结点小于右子结点，k指向右子结点
            if(k + 1 < length && arr[k] < arr[k+1]){
                k++;
            }
            // 如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
            System.out.println("ccccc: " + Arrays.toString(arr));
        }
        arr[i] = temp;//将temp值放到最终的位置
        System.out.println("aaaaa: " + Arrays.toString(arr));
    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
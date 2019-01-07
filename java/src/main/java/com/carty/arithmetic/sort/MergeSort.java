/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: MergeSort
 * Author:   Lifeifei
 * Date:     2018/12/26 14:17
 * Description: 归并排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;

/**
 * 〈归并排序〉
 *
 * @author Lifeifei
 * @create 2018/12/26
 * @since 1.0.0
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arrays = {33, 11, 22, 44, 66, 77, 99, 55, 88, 87, 94, 25, 36, 45, 12, 37, 15, 14};
        merSort(arrays,0,arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }

    public static void merSort(int[] arr, int left, int right){

        if(left < right){
            int mid = (left + right) / 2;
            //左边归并排序，使得左子序列有序
            merSort(arr, left, mid);
            //右边归并排序，使得右子序列有序
            merSort(arr, mid+1, right);
            //合并两个子序列
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];//ps：也可以从开始就申请一个与原数组大小相同的数组，因为重复new数组会频繁申请内存
        int i = left;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= right){
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[k++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[k++] = arr[j++];
        }
        //将temp中的元素全部拷贝到原数组中
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[k2 + left] = temp[k2];
        }
    }

}
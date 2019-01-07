/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: InsertionSort
 * Author:   Lifeifei
 * Date:     2018/12/26 10:04
 * Description: 插入排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;

/**
 * 〈插入排序〉
 *
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 *
 * @author Lifeifei
 * @create 2018/12/26
 * @since 1.0.0
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {11, 33, 22, 44, 66, 77, 99, 55, 88};
        int preIndex = 0;
        int current = 0;
        for (int i = 1 ; i < array.length ; i++) {
            preIndex = i - 1;
            current = array[i];
            while (preIndex > 0 && array[preIndex] > current) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
}
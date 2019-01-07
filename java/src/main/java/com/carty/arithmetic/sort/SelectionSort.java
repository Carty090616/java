/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: SelectionSort
 * Author:   Lifeifei
 * Date:     2018/12/26 9:37
 * Description: 选择排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;

/**
 * 〈选择排序〉
 *
 * 选择排序(Selection-sort)是一种简单直观的排序算法。
 * 它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 以此类推，直到所有元素均排序完毕。
 *
 * @author Lifeifei
 * @create 2018/12/26
 * @since 1.0.0
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {11, 33, 22, 44, 66, 77, 99, 55, 88};
        int temp = 0;
        for (int i = 0 ; i < array.length - 1 ; i++) {
            int minIndex = i;
            for (int j = i + 1 ; j < array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
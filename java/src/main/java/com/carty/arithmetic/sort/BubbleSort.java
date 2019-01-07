/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: BubbleSort
 * Author:   Lifeifei
 * Date:     2018/12/24 16:45
 * Description: 冒泡排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;

/**
 * 〈冒泡排序〉
 *
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *
 * @author Lifeifei
 * @create 2018/12/24
 * @since 1.0.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {11, 33, 22, 44, 66, 77, 99, 55, 88};
        int temp = 0;
        for (int i = 0 ; i < array.length - 1 ; i++) {
            for (int j = 0 ; j < array.length - 1 - i ; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
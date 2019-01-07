/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: ShellSort
 * Author:   Lifeifei
 * Date:     2018/12/26 10:22
 * Description: 希尔排序
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic.sort;

import java.util.Arrays;

/**
 * 〈希尔排序〉
 *
 * @author Lifeifei
 * @create 2018/12/26
 * @since 1.0.0
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arrays = {33, 11, 22, 44, 66, 77, 99, 55, 88, 87, 94, 25, 36, 45, 12, 37, 15, 14};
        // 定义增量值
        int gap = 0;
        while (gap < arrays.length / 3) {          // 动态定义间隔序列
            gap = gap * 3 + 1;
        }
        for (int step = gap; step > 0; step /= 3) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arrays.length; i++) {
                int j = i;
                int temp = arrays[j];

                // j - step 就是代表与它同组隔壁的元素
                // 循环
                while (j - step >= 0 && arrays[j - step] > temp) {
                    arrays[j] = arrays[j - step];
                    j = j - step;
                }
                arrays[j] = temp;
            }
        }
        System.out.println("最终结果：" + Arrays.toString(arrays));
    }
}
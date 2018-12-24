/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: CalculateSumFromArray
 * Author:   Lifeifei
 * Date:     2018/12/24 16:39
 * Description: n个整数，找出连续的m个数加和是最大
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic;

import java.util.Arrays;
import java.util.List;

/**
 * 〈n个整数，找出连续的m个数加和是最大〉
 *
 * @author Lifeifei
 * @create 2018/12/24
 * @since 1.0.0
 */
public class CalculateSumFromArray {

    public static void main(String[] args) {
        // int[] 数组 asList返回 int[];形式List对象
        Integer[] paras = { 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15, 16, 17 };
        //引用类型的数组转化为集合
        List<Integer> lists = Arrays.asList(paras);
        int n = 5;
        //将集合转化为数组
        System.out.println("最总结果：" + getArray((Integer[]) lists.toArray(), n));

//        if (false || true && true) {
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
    }

    public static <T> String getArray(Integer[] params, int n) {
        // 声明maxs,初始化temp
        Integer[] maxs = null, temp = null;
        if (!(params instanceof Integer[])) {
            return "参数类型错误";
        }
        temp = new Integer[n];
        maxs = new Integer[n];
        int len = params.length - n;
        for (int i = 0; i < len + 1; i++) {
            // 数组复制 相当于切片
            System.arraycopy(params, i, temp, 0, n);
            System.out.println("temp" + Arrays.toString(temp));
            System.out.println("maxs" + Arrays.toString(maxs));
            // maxs[0] == null 判断数组的长度是否大于需要计算的长度
            if (maxs[0] == null
                    || (maxs[0] != null && (getSum(maxs) < getSum(temp)))) {
                // 引用相同 不可使用 maxs = temp;
                // 从temp复制一份给maxs
                System.arraycopy(temp, 0, maxs, 0, n);
            }
        }
        // 将数组以字符打印
        return Arrays.toString(maxs);
    }
    //取数组或者集合的加和
    public static <T> int getSum(T t) {

        int sum = 0;
        if (t instanceof List<?>) {
            List<?> temp = (List<?>) t;
            for (int i = 0; i < temp.size(); i++) {
                sum += (Integer)temp.get(i);
            }
        } else if (t instanceof Integer[]) {
            Integer[] temp = (Integer[]) t;
            for (int i = 0; i < temp.length; i++) {
                sum += temp[i];
            }
        }
        return sum;
    }
}
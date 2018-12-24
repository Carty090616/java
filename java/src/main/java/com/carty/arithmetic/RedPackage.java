/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: RedPackage
 * Author:   Lifeifei
 * Date:     2018/12/24 16:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.arithmetic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 〈微信红包随机算法〉
 *
 * @author Lifeifei
 * @create 2018/12/24
 * @since 1.0.0
 */
public class RedPackage {
    
        public static List<Integer> divideRedPackage (Integer totalAmount, Integer totalPeopleNum) {
        List<Integer> amountList = new ArrayList<Integer>();
        Integer restAmount = totalAmount;
        Integer restPeopleNum = totalPeopleNum;
        Random random = new Random();
        for (int i = 0 ; i < totalPeopleNum - 1 ; i++) {
            int amount = random.nextInt(restAmount / restPeopleNum * 2 - 1) + 1;
            restAmount -= amount;
            restPeopleNum -- ;
            amountList.add(amount);
        }
        amountList.add(restAmount);
        return amountList;
    }

    public static void main(String[] args) {
        List<Integer> amountList = divideRedPackage(10000, 10);
        for (Integer amount : amountList) {
            System.out.println("抢到金额：" + new BigDecimal(amount).divide(new BigDecimal(100)));
        }
    }
}
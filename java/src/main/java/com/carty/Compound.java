/**
 * Copyright (C), 2015-2019, 章鱼云商
 * FileName: Compound
 * Author:   Lifeifei
 * Date:     2019/1/7 9:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty;

import java.math.BigDecimal;

/**
 * 〈〉
 *
 * @author Lifeifei
 * @create 2019/1/7
 * @since 1.0.0
 */
public class Compound {

    public static void main(String[] args) {
        // 初始资金
        BigDecimal initalFund = new BigDecimal(2000);
        // 利率
        BigDecimal rate = new BigDecimal("1.1");
        BigDecimal sumRate = new BigDecimal(0);
        for (int i = 0 ; i < 12 ; i++) {
            int power = i + 1;
            BigDecimal nextRate = rate.pow(power);
            sumRate = sumRate.add(nextRate);
        }
        // 输出
        System.out.println(initalFund.multiply(sumRate));
    }
}
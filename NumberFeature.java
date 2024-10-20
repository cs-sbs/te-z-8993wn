package org.example;
import java.util.Scanner;
public class NumberFeature {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();

    int result = 0;
    int position = 1; // 从个位开始，数位为1

    while (number > 0) {
        int digit = number % 10; // 获取当前个位数字
        boolean digitOdd = (digit % 2 != 0); // 判断数字是否为奇数
        boolean positionOdd = (position % 2 != 0); // 判断数位是否为奇数

        if (digitOdd == positionOdd) {
            result += Math.pow(2, position - 1); // 如果奇偶一致，则加上对应的二进制位值
        }

        number /= 10; // 去掉当前个位数字，继续处理下一位
        position++; // 数位加1
    }

    System.out.println(result);
}
}

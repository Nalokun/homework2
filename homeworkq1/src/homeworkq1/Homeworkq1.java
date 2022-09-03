/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkq1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aseel
 */
public class Homeworkq1 {

    public static void main(String[] args) {
        
        System.out.println("huseen eyad mohamed bouzieh\n202111625");
        Scanner in = new Scanner(System.in);
        Num1ANum2 n = new Num1ANum2(new Num1(), new Num2());
        char c;
        for (;;) {
            System.out.println("-----------------------");
            printmanu();
            c = in.next().charAt(0);
            switch (c) {
                case '1':
                    n.converttobinary();
                    break;
                case '2':
                    n.whichoneismore();
                    break;
                case '3':
                    n.sumprime();
                    break;
                case '4':
                    n.samenums();

                    break;
                case '5':
                    n.getNum1().rotaion(new Random().nextInt(8) + 1);

                    break;
                case '6':
                    n.Exist();
                    break;
                case '7':
                    n.getNum2().possible();
                    break;
                case '8':
                    System.out.println("bay");
                    return;

            }
        }

    }
    public static void printmanu(){
        System.out.println("1-binary representation\n2-number that has more ones"
                + "\n3-sum of prime numbers\n4-The same\n5-the first number after rotating its digits by R"
                + "\n6-EXIST\n7-Possible\n8-Exit");
        System.out.println("   ");
    }
}

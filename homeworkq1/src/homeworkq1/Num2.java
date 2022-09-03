/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkq1;

import java.util.Scanner;

/**
 *
 * @author aseel
 */
class Num2 {

    private long num2;
    private int countofone;
 Scanner in = new Scanner(System.in);
    Num2() {
        System.out.println("plz sent first num:");
        num2 = in.nextLong();
    }

    public long getNum2() {
        return num2;
    }

    public void setNum1(long num2) {
        this.num2 = num2;
    }

    public int getCountofone() {
        return countofone;
    }

    public void setCountofone() {
        countofone++;
    }

    void possible() {
        long j = num2;
        int b[] = new int[10];
        int count = 0;
        while (j > 0) {
            int k = (int)j % 10;
            b[k]++;
            j /= 10;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("notpossible");
            return;
        }
        if (count<=1) {
            System.out.println("possible");
        }
    }

}

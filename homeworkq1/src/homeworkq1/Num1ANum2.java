/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkq1;

/**
 *
 * @author aseel
 */
public class Num1ANum2 {

    private Num1 num1;
    private Num2 num2;
    private boolean flag;

    public Num1ANum2(Num1 num1, Num2 num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void converttobinary() {
        long binary = 0, rem, p = 1;
        long copy = num1.getNum1();
        while (copy != 0) {
            rem = copy % 2;
            if (rem == 1) {
                num1.setCountofone();
            }
            binary = binary + rem * p;
            p = p * 10;
            copy = copy / 2;
        }
        System.out.println("the fist num1:" + binary);
        binary = 0;
        p = 1;
        copy = num2.getNum2();
        while (copy != 0) {
            rem = copy % 2;
            if (rem == 1) {
                num2.setCountofone();
            }
            binary = binary + rem * p;
            p = p * 10;
            copy = copy / 2;
        }
        flag=true;
        System.out.println("the second num2:" + binary);
    }

    void whichoneismore() {
        if (flag==false){
            converttobinary();
        }
        if (num1.getCountofone() > num2.getCountofone()) {
            System.out.println("the bigist count of one is:" + num1.getNum1());
        } else if (num1.getCountofone() < num2.getCountofone()) {
            System.out.println("the bigist count of one is:" + num2.getNum2());
        } else {
            System.out.println("the bigist count of one is: eqyal");
        }
    }

    void sumprime() {
        long max = (num2.getNum2() > num1.getNum1()) ? num2.getNum2() : num1.getNum1();
        long min = (num2.getNum2() < num1.getNum1()) ? num2.getNum2() : num1.getNum1();
        long sum = 0;
        for (long i = min; i <= max; i++) {
            boolean flag = false;
            if (i == 1 || i == 0) {
                continue;
            }
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                sum += i;
            }
        }
        System.out.println("the sumprime of bettwen two numbers is :" + (sum));
    }

    public Num1 getNum1() {
        return num1;
    }

    public void setNum1(Num1 num1) {
        this.num1 = num1;
    }

    public Num2 getNum2() {
        return num2;
    }

    public void setNum2(Num2 num2) {
        this.num2 = num2;
    }

    void Exist() {
        long sum2 = 0;
        long copy = num1.getNum1();
        long copy2 = num2.getNum2();
        while (copy2 > 0) {
            long y = copy2 % 10;
            sum2 += y;
            copy2 /= 10;
        }

        while (copy > 0) {
            if (sum2 == copy % 10) {
                System.out.println("isExist");
                return;

            }
            copy /= 10;
        }
        System.out.println("is not exist");
    }

    void samenums() {
        String num11 = "";
        String num22 = "";
        num11 += num1.getNum1();
        num22 += num2.getNum2();
        String n = num11 + num22;
        int count = 0;
        int count2=0;
        if (num11.length() > num22.length() || num11.length() < num22.length()) {
            System.out.println("cant be same");
            return;
        }
        for (int i = 0; i < n.length()/2; i++) {
            count=0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(i)==n.charAt(j)){
                    count++;
                }
            }
            if (count%2==1){
                count2++;
            }
            
        }
        if (count2>=1){
            System.out.println("is notsame");
        }
        else
            System.out.println("issame");

    }

}

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
class Num1 {

    private long num1;
    private int countofone;
     Scanner in = new Scanner(System.in);

    Num1() {
        System.out.println("plz sent first num:");
        num1 = in.nextLong();
    }

    public long getNum1() {
        return num1;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }
    public int getCountofone() {
        return countofone;
    }

    public void setCountofone() {
       countofone++;
    }

    void rotaion(int r) {
        if (r<=4){
            //rotate right
        long num=1;
        long copy=num1;
        int count=0;
        int p=1;
        while(copy>0){
            copy/=10;
            p*=10;
        }       
        p/=10;
        num=num1%10;
        num*=p;
        num+=num1*0.1;
          System.out.println(num); 
        }
        else{
            //rotate left
        long copy=num1;
        int count=0;
        int p=1;
        while(copy>0){
            copy/=10;
            p*=10;
        }       
        p/=10;
          System.out.println(num1%p+""+num1/p);
        }
            
  
    }

}

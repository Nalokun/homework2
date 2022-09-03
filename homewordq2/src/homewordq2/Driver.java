/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homewordq2;

/**
 *
 * @author aseel
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p[] = new Person[4];
        //Teacher(long id, String name, int age, double salary
        p[1] = new Teacher(23435, "huseen", 354, 3002);
        p[3] = new Teacher(23438, "eyad", 351, 3002);
        p[2] = new Teacher(23433, "bouzieh", 353, 3003);
        p[0] = new Student(23211, "mohamaed", 45);
        Paid p2[] = Employee.count(p);
        displaypaid(p2);
        System.out.println("------------------------------");
        Acadmic a[] = Person.countofacdmic(p);
        displayacdmic(a);
        System.out.println("------------------------------");
        displarrayafterremove(p);

    }

    private static void displaypaid(Paid[] p2) {
        for (int i = 0; i < p2.length; i++) {
            if (p2[i] instanceof Teacher) {
                Teacher t = (Teacher) p2[i];
                System.out.println(t.printinformation());
            }
            if (p2[i] instanceof Administrative) {
                Administrative a = (Administrative) p2[i];
                System.out.println(a.printinformation());
            }
        }
    }

//    private static Paid[] count(Person[] p) {
//        int j = 0;
//
//        int count = 0;
//        for (int i = 0; i < p.length; i++) {
//            if (p[i] instanceof Paid) {
//                count++;
//            }
//        }
//        Paid p2[] = new Paid[count];
//        for (int i = 0; i < p.length; i++) {
//            if (p[i] instanceof Paid) {
//                p2[j]=(Paid)p[i];
//                j++;
//            }
//        }
//        return p2;
//    }
    private static void displayacdmic(Acadmic[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Teacher) {
                Acadmic temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getClass().getSimpleName());
        }
    }

    private static void displarrayafterremove(Person[] p) {
        boolean b[] = new boolean[p.length];
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (b[i] == true) {
                    break;
                }
                if (p[i] instanceof Paid) {
                    Paid temp = (Paid) p[i];
                    Paid temp2 = (Paid) p[j];
                    if (temp.getsalary() == temp2.getsalary()) {
                        b[i] = true;
                        b[j] = true;
                        break;
                    }
                }
                if (p[i].getName().equals(p[j].getName())) {
                    b[i] = true;
                    b[j] = true;
                    break;
                }
                if (p[i].getId() == p[j].getId()) {
                    b[i] = true;
                    b[j] = true;
                    break;
                }
                if (p[i].getAge() == p[j].getAge()) {
                    b[i] = true;
                    b[j] = true;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            if (b[i] == false) {
                System.out.println(p[i].toString());
            } else {
                p[i] = null;
            }
        }
    }

}

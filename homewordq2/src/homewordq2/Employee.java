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
public abstract class Employee extends Person implements Paid {
    
    protected double salary;
protected long id_bank;
protected long id_emp;

    static Paid[] count(Person[] p) {
             int j = 0;

        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Paid) {
                count++;
            }
        }
        Paid p2[] = new Paid[count];
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Paid) {
                p2[j]=(Paid)p[i];
                j++;
            }
        }
        return p2;
    }


    public Employee(long id, String name, int age,double salary) {
        super(id, name, age);
        this.salary=salary;
    }
    

    @Override
    public abstract void setid_bank(long id_bank);
    

    @Override
    public abstract void setsalary(double salary);

    @Override
    public abstract double getsalary();

    public long getId_bank() {
        return id_bank;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId_emp() {
        return id_emp;
    }

    public void setId_emp(long id_emp) {
        this.id_emp = id_emp;
    }
   
    
    
    
}

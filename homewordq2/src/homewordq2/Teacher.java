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
public class Teacher extends Employee implements Acadmic {
private boolean havechild;
private long number_phone;
private long number_phpne2;


    public Teacher(long id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    public void setid_bank(long id_bank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setsalary(double salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getsalary() {
        return salary;
    }

    @Override
    public String getcity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setcity(String city) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getacadmicname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Teacher{" + super.getName()+" "+super.getAge()+" "+super.getId()+" "+salary+'}';
    }
    public String printinformation() {
        return this.getClass().getSimpleName() + " " + salary ;
    }
    
    
}

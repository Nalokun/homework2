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
public class Student extends Person implements Acadmic {
private String city;//where he is studing location
private String nameac;
private String Length;

    public Student(long id, String name, int age) {
        super(id, name, age);
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

    public void setNameac(String nameac) {
        this.nameac = nameac;
    }
      @Override
    public String toString() {
        return "Student{" + super.getName()+" "+super.getAge()+" "+super.getId()+" "+'}';
    }
    
    
}

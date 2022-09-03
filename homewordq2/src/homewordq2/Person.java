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
public abstract class Person {
    private long id;
    private String name;
    private int age;

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       static Acadmic[] countofacdmic(Person[] p) {
          int j = 0;

        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Acadmic) {
                count++;
            }
        }
       Acadmic p2[] = new Acadmic[count];
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Acadmic) {
                p2[j]=(Acadmic)p[i];
                j++;
            }
        }
        return p2;
    }
       

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
    
}

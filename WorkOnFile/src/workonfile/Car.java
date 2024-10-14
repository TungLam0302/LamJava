/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workonfile;

/**
 *
 * @author docao
 */
public class Car {
    private String name;
    private int pice;

    public Car(String name, int pice) {
        this.name = name;
        this.pice = pice;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return  name + ";" + pice ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }
    
    
}

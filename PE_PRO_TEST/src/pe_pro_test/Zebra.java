/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe_pro_test;

public class Zebra {

    String owner;
    int weight;

    public Zebra() {
    }

    public Zebra(String owner, int weight) {
        this.owner = owner;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getOwner() {
        return owner;
    }

    public Zebra(String owner) {
        this.owner = owner;
    }

    public Zebra(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight - this.owner.length();
    }

    

    @Override
    public String toString() {
        return "Zebra{" + "owner=" + owner + ", weight=" + weight + '}';
    }

}

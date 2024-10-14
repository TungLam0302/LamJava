/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workonfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author docao
 */
public class Control {
    public void writeFlie(List<Car> listCar){
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (Car car : listCar) {
                bw.write(car.toString());
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
        }
    }
    
    public List<Car> readFromFile(){
        List<Car> listCar = new ArrayList<>();
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {                
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String textSplit[] = line.split(";");
                String name = textSplit[0];
                int pice = Integer.parseInt(textSplit[1]);
                
                listCar.add(new Car(name, pice));
            }
        } catch (Exception e) {
        }
        return listCar;
    }
}

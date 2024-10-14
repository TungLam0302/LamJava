package workonfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkOnFile {
    
    

    public static void main(String[] args) {
        String text = "lam cu be";
        Control ct = new Control();
        String listName[] = {"lam gio tai", "giang bilat", "dat coder"};

        Car x1 = new Car("lamaudi", 9000);
        Car x2 = new Car("lamaudi1", 9100);
        Car x3 = new Car("lamaudi2", 9200);

        List<Car> listCar = new ArrayList<>();
//        listCar.add(x1);
//        listCar.add(x2);
//        listCar.add(x3);

//        ct.writeFlie(listCar);
        
        
        listCar = ct.readFromFile();
        listCar.get(0).setPice(1000000);
        System.out.println(listCar.get(0));
        
    }

}

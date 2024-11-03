package Com;

import java.io.*;
import java.util.*;

public class CarList {

    private ArrayList<Car> DanhSachCar;
    private Scanner scan;
    private Menu menu;
    private BrandList brandList;

    public CarList() {
        this.DanhSachCar = new ArrayList<Car>();
        this.scan = new Scanner(System.in);
        this.menu = new Menu();
    }

    public CarList(ArrayList<Car> DanhSachCar, BrandList bList) {
        this.DanhSachCar = DanhSachCar;
        this.brandList = bList;
        this.scan = new Scanner(System.in);
        this.menu = new Menu<>();
    }

    public ArrayList<Car> getCars() {
        return this.DanhSachCar;
    }

    @Override
    public String toString() {
        return this.getCarID() + ", " + getBrand() + ", " + getColor() + ", " + getFrameID() + ", " + getEngineID();
    }

    public String screenString() {
        return getBrand().getBrandName() + this.getCarID() + getColor() + getFrameID() + getEngineID();
    }

    public boolean loadFromFile(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] part = line.split(", ");
                if (part.length == 5) {
                    String carID = part[0];
                    String brandID = part[1];
                    String color = part[2];
                    String frameID = part[3];
                    String engineID = part[4];

                    int i = brandList.searchID(brandID);
                    if (i >= 0) {
                        Brand brand = brandList.getBrands().get(i);
                        DanhSachCar.add(new Car(carID, brand, color, frameID, engineID));
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean saveToFile(String file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Car car : DanhSachCar) {
                bw.write(car.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    public int searchID(String carID) {
        int n = DanhSachCar.size();
        for (int i = 0; i < n; i++) {
            if (this.DanhSachCar.get(i).getCarID().equals(carID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchFrame(String fID) {
        int n = DanhSachCar.size();
        for (int i = 0; i < n; i++) {
            if (this.DanhSachCar.get(i).getFrameID().equals(fID)) {
                return i;
            }
        }
        return -1;
    }

    public int searchEngine(String eID) {
        int n = DanhSachCar.size();
        for (int i = 0; i < n; i++) {
            if (this.DanhSachCar.get(i).getEngineID().equals(eID)) {
                return i;
            }
        }
        return -1;
    }

    public void addCar() {
        System.out.println("Enter CarID: ");
        String carID = scan.nextLine();
        if (carID.isEmpty()) {
            System.out.println("CarID cannot be blank!");
            return;
        }

        if (searchID(carID) >= 0) {
            System.out.println("CarID cannot be duplicated!");
            return;
        }
        System.out.println("Brand List");

        Brand b = (Brand) menu.ref_getChoice(brandList.getBrands());
        if (b == null) {
            System.out.println("Error!");
            return;
        }

        System.out.println("Enter Color: ");

        String color = scan.nextLine();
        if (color.isEmpty()) {
            return;
        }
        System.out.println("Enter FrameID: ");
        String frameID = scan.nextLine();
        if (searchFrame(frameID) >= 0) {
            System.out.println("It must be in the “F0000” format and not be duplicated!");
            return;
        }
        System.out.println("Enter EngineID: ");
        String engineID = scan.nextLine();
        if (searchEngine(engineID) >= 0) {
            System.out.println("It must be in the “E0000” format and not be duplicated!");
            return;
        }

        Car newCar = new Car(carID, b, color, frameID, engineID);
        DanhSachCar.add(newCar);
    }

    public void printBasedBrandName() {
        System.out.println("Enter A Part Of Brand Name: ");
        String aPartOfBrandName = scan.nextLine().trim().toUpperCase();
        if (aPartOfBrandName.isEmpty()) {
            return;
        }
        int n = DanhSachCar.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            Car c = DanhSachCar.get(i);
            if (c.getBrand().getBrandName().contains(aPartOfBrandName)) {
                System.out.println(c.screenString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No car is detected!");
        }
        System.out.println();
    }

    public boolean removeCar() {
        System.out.println("Enter CarID to remove: ");
        String carID = scan.nextLine();
        if (carID.isEmpty() || "0".equals(carID)) {
            return false;
        }
        int find = searchID(carID);
        if (find < 0) {
            System.out.println("Not Found!");
            return false;
        } else {
            DanhSachCar.remove(find);
        }
        return true;
    }

    public boolean updateCar() {
        System.out.println("Enter carID to update: ");
        String carID = scan.nextLine().trim().toUpperCase();
        if (carID.isEmpty()) {
            return false;
        }
        int find = searchID(carID);
        if (find < 0) {
            return false;
        } else {
            Brand b = (Brand) menu.ref_getChoice(brandList.getBrands());

            System.out.println("Enter newColor: ");
            String newColor = scan.nextLine();

            System.out.println("Enter newFrameID: ");
            String newFrameID = scan.nextLine();

            if (searchFrame(newFrameID) > 0) {
                System.out.println("It must be in the “F0000” and not be duplicated!");
                return false;
            }
            System.out.println("Enter newEngineID: ");
            String newEngineID = scan.nextLine();
            if (searchEngine(newEngineID) >= 0) {
                System.out.println("It must be in the “E0000” format and not be duplicated!");
                return false;
            }
            Car newCar = this.DanhSachCar.get(find);
            newCar.setBrand(b);
            newCar.setColor(newColor);
            newCar.setEngineID(newEngineID);
            newCar.setFrameID(newFrameID);

            return true;
        }
    }

    public void listCar() {
        Collections.sort(DanhSachCar);
        for (Car sv : DanhSachCar) {
            System.out.println(sv);
        }
    }
}

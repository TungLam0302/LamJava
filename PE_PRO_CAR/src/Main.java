
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maker: ");
        String makerText = sc.nextLine();

        System.out.print("Enter Price: ");
        int priceText = sc.nextInt();

        System.out.print("Enter type: ");
        int typeText = sc.nextInt();

        System.out.println("1.Test ToString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1,2,3): ");
        choice = sc.nextInt();

        Car c1 = new Car(makerText, priceText);
        SpecCar c2 = new SpecCar(makerText, priceText, typeText);

        while (choice < 1 || choice > 3) {
            System.out.println("please try again!");
            choice = sc.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(c1.toString());
                System.out.println(c2.toString());
                break;
            case 2:
                System.out.println("OUTPUT:");
                c2.setData();
                System.out.println(c2.getMaker() +", "+ c2.getPrice());

                break;
            case 3:
                System.out.println("OUTPUT:");
                System.out.println(c2.getValue());
                break;
        }
    }

}

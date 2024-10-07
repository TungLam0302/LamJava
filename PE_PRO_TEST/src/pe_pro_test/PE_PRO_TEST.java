package pe_pro_test;

import java.util.Scanner;

public class PE_PRO_TEST {

    public static void displayMenu() {
        System.out.println("1. Test getOwner()");
        System.out.println("2. setWeight()");
        System.out.println("3. exit");
        System.out.print("Enter TC(1 or 2 or 3): ");

    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter owner: ");
        String ownerText = sc.nextLine();

        System.out.print("Enter weight: ");
        int weightText = sc.nextInt();
        Zebra z1 = new Zebra(ownerText, weightText);
        while (choice != 3) {
            displayMenu();

            choice = sc.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("pls Enter Again!");
                choice = sc.nextInt();
            }
            switch (choice) {
                case 1:

                    System.out.println("Output:");
                    System.out.println("" + z1.toString());
                    System.out.println("=======================================");
                    break;
                case 2:

                    System.out.print("Enter new Weight: ");
                    z1.setWeight(sc.nextInt());
                    System.out.println("Output:");
                    System.out.println("" + z1.getWeight());
                    System.out.println("=======================================");
                    break;
            }
        }
    }

}

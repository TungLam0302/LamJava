/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author docao
 */
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int countString = 0;
        String[] listElement;
        listElement = str.split(" ");
        for (String item : listElement) {
            for (int i = 0; i < item.length(); i++) {
                char ch = item.charAt(i);
                if (Character.isDigit(ch)) {
                    int number = Character.getNumericValue(ch);
                    if (number % 2 != 0) {
                        countString++;
                        break;
                    }
                }
            }
        }
        return countString;
    }

    @Override
    public String f2(String str) {
        int min = (int) Math.pow(2, 32);
        int max = (int) Math.pow(-2, 31);
        String[] listElement;
        listElement = str.split(" ");
        for (String lamdeptrai : listElement) {

            if (lamdeptrai.length() > max) {
                max = lamdeptrai.length();
            }
            if (lamdeptrai.length() < min) {
                min = lamdeptrai.length();
            }
        }
        
        for (int i = 0; i < listElement.length; i++) {
            if(listElement[i].length() == min ){
                String maxString = "" + max;
                listElement[i] = maxString ;
                break;
            }
        }
        String result  = String.join(" ", listElement);
        return result ;
    }

}

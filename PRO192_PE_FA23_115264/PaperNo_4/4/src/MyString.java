/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author docao
 */
public class MyString implements IString {

    public boolean checkString(String str) {
        if (Character.isDigit(str.charAt(0)) && !Character.isDigit(str.charAt(str.length() - 1))) {
            return true;
        }
        return false;
    }

    @Override
    public int f1(String string) {
        String[] listElement;
        listElement = string.split(" ");
        int count = 0;
        for (int i = 0; i < listElement.length - 1; i++) {
            if (checkString(listElement[i])) {
                count++;
            }

        }

        return count;
    }

    public boolean checkStringF2(String str) {
        int count = 0;
        // dem so trong chuoi String
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        return false;
    }

    @Override
    public String f2(String string) {
        String result = "";
        String[] listElement;
        listElement = string.split(" ");
        int count = 0;
        String strDelete = "";
        // tim thang can delete
        for (int i = 0; i < listElement.length; i++) {
            
            if (checkStringF2(listElement[i])) {
                ++count;
            }
            if(count == 2 ){
                strDelete = listElement[i];
                break;
            }
        }
        
        // neu gap thang delete thif k cho no ve
        for (int i = 0; i < listElement.length; i++) {
            
            if(listElement[i] != strDelete ){
                result = result + listElement[i] +" ";
            }
        }
        return result.trim();
    }

}
// a a1b a1b2 a2b a2b a2b3c a2b
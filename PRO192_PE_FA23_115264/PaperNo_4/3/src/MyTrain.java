
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class MyTrain implements ITrain {

    public boolean containName(String name) {
        int intdexOfA = 0, intdexOfB = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'A') {
                intdexOfA++;
                if (intdexOfA == 2) {
                    return false;
                }
            }
            if (name.charAt(i) == 'B') {
                intdexOfB++;
                if (intdexOfB == 2) {
                    return false;
                }
            }

        }
        if ((intdexOfB == 1 && intdexOfA == 0) || (intdexOfB == 0 && intdexOfA == 1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int f1(List<Train> list) {
        int sum = 0;
        for (Train item : list) {
            if (containName(item.getName())) {
                sum = sum + item.getLoad();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Train> list) {
        int min = (int) 1e9;
        int vitri = 0;
        Train minTrain = new Train();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLoad() < min) {
                min = list.get(i).getLoad();
                vitri = i;
                minTrain = list.get(i);
            }

        }
        list.remove(vitri);
        list.add(minTrain);
    }

    @Override
    public void f3(List<Train> list) {
        int max = (int) -1e9;
        int count = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().length() >= max) {
                max = list.get(i).getName().length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().length() == max){
                count++;
            }
            if(count == 2){
                list.remove(i);
                break;
            }
        }
    }

}

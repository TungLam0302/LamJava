
import java.util.Collections;
import java.util.List;

public class MyCoffee implements ICoffee {

    @Override
    public int f1(List<Coffee> t) {
        int count = 0;
        for (Coffee temp : t) {
            if (temp.getName().contains("A") || temp.getName().contains("B")) {
            } else {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Coffee> t) {
        double min = Math.pow(2, 32);
        int index = -1;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getSize() < min) {
                min = t.get(i).getSize();
                index = i;
            }
        }
        t.remove(index);
//        for (Coffee temp : t) {
//            if (temp.getSize() < min) {
//                min = temp.getSize();
//            }
//        }
//        for (Coffee temp : t) {
//            if (temp.getSize() == min) {
//                t.remove(temp);
//                break;
//            }
//        }

    }

    @Override
    public void f3(List<Coffee> t) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                int a = t.get(j).getSize();
                int b = t.get(j + 1).getSize();
                a = a > 9 ? a / 10 : a;
                b = b > 9 ? b / 10 : b;
                if (a <= b) {
                    Collections.swap(t, j, j + 1);
                }
            }
        }
    }
}

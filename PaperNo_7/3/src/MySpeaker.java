
import java.util.Collections;
import java.util.List;

public class MySpeaker implements ISpeaker {

    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (Speaker item : t) {
            if (item.getPower() > 10) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int a = t.get(j).getPower();
                int b = t.get(j + 1).getPower();
                if (a >= b) {
                    Collections.swap(t, j, j + 1);
                }
            }
        }
    }

    @Override
    public void f3(List<Speaker> t) {
        int min = (int) 1e9;
        for (Speaker temp : t) {
            if (temp.getPower() < min) {
                min = temp.getPower();
            }
        }
        for (Speaker temp : t) {
            if (temp.getPower() == min) {
                t.remove(temp);
                break;
            }
        }
//        int index = -1;
//        int min = (int) Math.pow(2, 32);
//        for (int i = 0; i < t.size(); i++) {
//            if (t.get(i).getPower() < min) {
//                min = t.get(i).getPower();
//                index = i;
//            }
//        }
//        t.remove(index);
    }

}

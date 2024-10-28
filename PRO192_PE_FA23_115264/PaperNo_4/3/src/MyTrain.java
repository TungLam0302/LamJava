
import java.util.List;

public class MyTrain implements ITrain {

    @Override
    public int f1(List<Train> list) {
        int sum = 0;
        for (Train temp : list) {
            if(temp.getName().contains("A") && temp.getName().contains("B")){
                sum += temp.getLoad();
            }
            
        }
        return sum;
    }

    @Override
    public void f2(List<Train> list) {
    }

    @Override
    public void f3(List<Train> list) {
    }

}

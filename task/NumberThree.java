package task;

import java.util.Arrays;

public class NumberThree {
    public void sortNum(Integer[] number) {
        Arrays.sort(number);

        String result = "";
        for (var e : number){
            result += String.valueOf(e) + " ";
        }
        System.out.println(result);
    }

}

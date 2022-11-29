import task.NumberOne;
import task.NumberThree;
import task.NumberTwo;

public class Main{
    
    public static void main(String[] args) {
        NumberOne myData = new NumberOne();
        NumberTwo filterArray = new NumberTwo();
        NumberThree sortArr = new NumberThree();

        Integer[] arr1 = {
            2,3,4,5
        };

        Integer[] arr2 = {
            1,3,5,7
        };

        Integer[] sortNum = {
            3,2,4,1,5
        };

        myData.getData();
        filterArray.finalArry(arr1, arr2);
        sortArr.sortNum(sortNum);
    }
}
package task;

public class NumberTwo {
    Integer[] finalArr;
    public void finalArry(Integer[] array1, Integer[] array2) {
        finalArr = new Integer[array1.length];
        for (Integer j = 0; j < array1.length; j++) {
            for(Integer i= 0; i < array2.length; i++) {
                if (array1[j] == array2[i]) {
                    finalArr[j] = array1[j];
                }
            }
        }

        String finalNumber = "";
        for (var e : finalArr) {
            if (e != null) {
                finalNumber += String.valueOf(e) + " ";
            }
        }

        System.out.println(finalNumber);
        System.out.println("=================================");
    
    }
}

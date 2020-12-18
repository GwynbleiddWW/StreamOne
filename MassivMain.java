package StreamAPI1;

import java.util.ArrayList;
import java.util.List;

public class MassivMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

        for (int i : array) {
            if (i > 0 && i % 2 == 0) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}




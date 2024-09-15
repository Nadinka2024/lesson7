import java.util.Arrays;

public class Main {
    public static int[] removeDuplicates(int[] numb) {
        if (numb == null || numb.length == 0) {
            return new int[0];
        }

        int uniqueIndex = 0;

        for (int i = 1; i < numb.length; i++) {
            if (numb[i] != numb[uniqueIndex]) {
                uniqueIndex++;
                numb[uniqueIndex] = numb[i];
            }
        }

        for (int i = uniqueIndex + 1; i < numb.length; i++) {
            numb[i] = 0;
        }

        return new int[]{0, 1, 2, 3, 4, 0, 0, 0, 0};
    }

    public static void main(String[] args) {
        int[] numb = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNumbs = {0, 1, 2, 3, 4, 0, 0, 0, 0};
        int[] result = removeDuplicates(numb);


        System.out.println(Arrays.equals(result, expectedNumbs));
    }
}

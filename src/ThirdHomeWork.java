import java.util.Arrays;

public class ThirdHomeWork {
    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание 1");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(array));
        changeZeroesAndOnes(array);
        System.out.println(Arrays.toString(array));


        // Задание №2
        System.out.println("Задание 2");
        int[] secondArray = new int[100];

        System.out.println(Arrays.toString(secondArray));
        fillArrayWithSequence(secondArray);
        System.out.println(Arrays.toString(secondArray));


        // Задание №3
        System.out.println("Задание 3");
        int[] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(thirdArray));
        doubleNumbersLessThanSixIn(thirdArray);
        System.out.println(Arrays.toString(thirdArray));


        // Задание №4
        System.out.println("Задание 4");

        int[][] square = new int[6][6];
        fillDiagonal(square);
        System.out.println("Две диагонали");
        printSquare(square);

        // Задание №5
        System.out.println("Задание 5");

        int initialValue = 2;
        int size = 8;

        int[] fourthArray = getNewArrayWith(initialValue, size);
        System.out.println(Arrays.toString(fourthArray));


        // Задание №6
        System.out.println("Задание 6");

        int[] minMaxArray = {1, 4, 9, 4, 0};
        System.out.println(Arrays.toString(minMaxArray));

        printMinAndMax(minMaxArray);


        // Задание №7
        System.out.println("Задание 7");

        int[] sumsArray = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sumsArray));
        boolean isBalanced = hasBalance(sumsArray);
        System.out.println("Суммы правой и левой части где либо равны? " + isBalanced);

    }

    public static void printSquare(int[][] inputSquare) {
        for (int i = 0; i < inputSquare.length; i++) {
            System.out.println(Arrays.toString(inputSquare[i]));
        }
    }


    // №1.
    public static void changeZeroesAndOnes(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] == 1) ? 0 : 1;
        }
    }

    // №2.
    public static void fillArrayWithSequence(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1);
        }
    }

    // №3.
    static void doubleNumbersLessThanSixIn(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }

    // №4.
    public static void fillDiagonal(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
            square[i][square[i].length - 1 - i] = 1;
        }
    }

    // №5.
    public static int[] getNewArrayWith(int initialValue, int length) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    // №6.
    public static void printMinAndMax(int[] inputArray) {
        int min = inputArray[0];
        int max = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (min > inputArray[i]) {
                min = inputArray[i];
            }

            if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // №7.
    public static boolean hasBalance(int[] inputArray) {
        int leftSum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            leftSum += inputArray[i];

            int rightSum = 0;
            for (int j = (i + 1); j < inputArray.length; j++) {
                rightSum += inputArray[j];
            }

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }


}
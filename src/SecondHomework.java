public class SecondHomework {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int a = 0;
        int b = 1;
        System.out.println(isSumBetween10And20(a, b));

        System.out.println("Задание 2.");
        printSignOf(0);

        System.out.println("Задание 3.");
        System.out.println(isNegative(-2));

        System.out.println("Задание 4.");
        print("Я хочу научиться кодить на JAVA!", 3);

        System.out.println("Задание 5.");
        System.out.println(isLeapYear(2021));
    }
    //Задание 1
    public static boolean isSumBetween10And20(int left, int right) {
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }

    // Задание 2
    public static void printSignOf(int number) {
        if (number > 0) {
            System.out.println("Число положительное!");
        } else if (number == 0) {
            System.out.println("Это ноль!");
        }
        else {
            System.out.println("Число отрицательное!");
        }
    }

    // Задание 3
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // Задание 4
    public static void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    // Задание 5
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연도를 입력하세요: ");
        int year = scanner.nextInt();

        boolean isLeapYear;


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }


        if (isLeapYear) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }

        scanner.close();
    }
}
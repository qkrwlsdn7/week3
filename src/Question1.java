import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "은(는) 짝수입니다.");
        } else {
            System.out.println(number + "은(는) 홀수입니다.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;


        while (true) {
            System.out.print("피라미드 바닥 숫자입력(홀수만):");
            num = scanner.nextInt();
            if (num%2 == 0) {
                System.out.println("홀수만 입력가능");
            }
            else {
                int i = 0;
                while (i < num) {
                    i++;
                    int j = 1;
                    while (j < num-i) {
                        System.out.print(" ");
                        j++;
                    }
                    j = 0;
                    while (j < 2*i+1) {
                        System.out.print("*");
                        j++;
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}

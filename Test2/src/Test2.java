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
                //입력받은 수의 절반 +1반큼의 높이만큼
                while (i<num/2+1){
                    int j = 0;
                    //입력받은 수의 절반 +1 -i 만큼 공백
                    while (j<(num/2+1)-i) {
                        System.out.print(" ");
                        j++;
                    }
                    j = 0;
                    //j가 2*i+1 일때 별 찍음
                    while (j<2*i+1) {
                        System.out.print("*");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
                break;
            }
        }
    }
}

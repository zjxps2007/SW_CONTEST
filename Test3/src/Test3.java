import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //1~10까지 랜덤수 생성
        int date = random.nextInt(10)+1;
        //입력받을 변수
        int num;

        System.out.println(date);
        //출력
        System.out.println("[빙고 게임]");
        System.out.println("기화는 총5번입니다.");
        System.out.println("숫자의 범위는 1-10 입니다.");
        //5번까지 반복하면서 값을 비교
        for(int i = 0; i <= 5; i++) {
            System.out.print(i+1+"번쨰 기회 : ");
            num = scanner.nextInt();
            //같을 경우 출력후 정지
            if(date == num) {
                System.out.println("[빙고]");
                break;
            }
            //입력받은 수가 클경우
            else if(date < num) {
                System.out.println("숫자가 큽니다.");
            }
            //입력받은 수가 작을 경우
            else {
                System.out.println("숫자가 작습니다.");
            }
        }
    }
}

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg;
        char gpamsg;

        System.out.print("이름을 입력하세요:");
        String name = sc.nextLine();
        //입력 받은대로 배열 생성
        System.out.print("입력할 성적의 개수를 입력하세요:");
        int gpanum = sc.nextInt();
        int[] gpaarr = new int[gpanum];

        //배열에 입력 받음
        int i = 0;
        while (i < gpaarr.length) {
            System.out.print(i+1+"번쨰 성적입력:");
            gpaarr[i] = sc.nextInt();
            sum += gpaarr[i];
            i++;
        }
        //평균
        avg = sum/gpaarr.length;
        //학점
        switch (avg/10) {
            case 10:
            case 9: gpamsg = 'A'; break;
            case 8: gpamsg = 'B'; break;
            case 7: gpamsg = 'C'; break;
            case 6: gpamsg = 'D'; break;
            default: gpamsg = 'F'; break;
        }
        //출력
        System.out.println("당신의 이름은:"+name);
        //배열의 값을 출력
        i = 0;
        while (i < gpaarr.length) {
            System.out.print(i+1+"번째 성적:"+gpaarr[i]+" ");
            i++;
        }
        //출력
        System.out.println();
        System.out.println("총합은:"+sum);
        System.out.println("평균은:"+avg);
        System.out.println("학점은:"+gpamsg);
    }
}

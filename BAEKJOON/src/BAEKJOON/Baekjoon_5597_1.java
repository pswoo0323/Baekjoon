package BAEKJOON;
import java.util.Scanner;
public class Baekjoon_5597_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean studentchk[] = new boolean[31];

        for(int i=1; i<=28; i++){
            studentchk[sc.nextInt()] = true;
        }
        for(int i=1; i<=30; i++){
            if(!studentchk[i])
                System.out.println(i);
        }
    }
}

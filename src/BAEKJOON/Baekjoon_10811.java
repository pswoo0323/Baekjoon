//1차원 배열
package BAEKJOON;

import java.util.Scanner;

public class Baekjoon_10811 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N ; i++){
            arr[i] = i+1;
        }
        for (int i=0; i<M; i++){
            int start = sc.nextInt() -1;
            int end = sc.nextInt() -1;
            for(; start <= end; start++, end--){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        for(int element : arr){
            System.out.printf("%d ", element);
        }
    }
}
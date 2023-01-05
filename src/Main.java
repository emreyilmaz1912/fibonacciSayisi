import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sayısı");
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz :");

        int start = 0, firstTerm = 1;
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(start+ " ");

            int nextTerm = start + firstTerm;
            start=firstTerm;
            firstTerm=nextTerm;


        }


    }
}
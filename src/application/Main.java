package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }


    public static void method1() {
        System.out.println("method 1 start");
        method2();
        System.out.println("method 1 finish");
    }

    public static void method2(){
        System.out.println("method 2 start");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("input error");
        }

        System.out.println("End of program");

        sc.close();

        System.out.println("method 2 finish");
    }
}

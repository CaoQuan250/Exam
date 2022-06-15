package Ex1;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance;
        double rate;
        double calculateInterest;
        System.out.println("Nhập số tiền bạn muốn vay: ");
        balance = sc.nextDouble();
        System.out.println("Nhập số % lãi của ngân hàng: ");
        rate = sc.nextDouble();
        calculateInterest = balance * (rate/1200);
        System.out.println("Số tiền lãi hàng tháng của ngân hàng là: "+(float)calculateInterest+"$");
    }
}


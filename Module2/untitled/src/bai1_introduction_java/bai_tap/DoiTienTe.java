package bai1_introduction_java.bai_tap;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số USD cần đổi: ");
        usd = scanner.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("Giá trị VND là: " + quyDoi);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class TinhThueThuNhap {
    public static void main(String[] args) {
        System.out.println("TinhThueThuNhap");
        Scanner sc = new Scanner(System.in);
        double luong,thuong,thunhap,thue;
        System.out.print("Nhap luong cua ban:");
        double luong = sc.nextDouble();
        System.out.print("Nhap thuong cua ban:");
        double thuong = sc.nextDouble();
        double thunhap = luong + thuong;
        if (thunhap <= 9000000)
        {System.out.println("Khong can dong thue");}
        else if (thunhap <= 15000000)
        { 
            thue = thunhap * 0.10; 
        }
    }
}

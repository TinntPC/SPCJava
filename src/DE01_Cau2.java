
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class DE01_Cau2 {
    public static void main(String[] args) {
        System.out.println("Cau 2");
        Scanner sc = new Scanner (System.in);
        double s,chuvi,canha,canhb,canhc,dientich;
        // s = nửa chu vi hình tam giác 
        System.out.print("Nhap canh a: ");
        canha = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        canhb = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        canhc = sc.nextDouble();
        s = (canha + canhb + canhc)/2;
        dientich= Math.sqrt(s*(s-canha)*(s-canhb)*(s-canhc));
        chuvi=s*2;
        System.out.println("Chu vi cua hinh tam giac la: " + chuvi);
        System.out.println("Dien tich cua hinh tam giac la: " + dientich);
    }
}

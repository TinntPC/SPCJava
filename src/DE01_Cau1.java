
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class DE01_Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i;
        int so;
        System.out.println("Nhap so va nhan stop de dung: ");
        while(true)
        {
            i=sc.nextLine();
            if(i.equalsIgnoreCase("stop"))
                break;
        }
    }
}

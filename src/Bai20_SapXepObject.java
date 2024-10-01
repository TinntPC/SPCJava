
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Administrator
 */
class SinhVien {

    private String ten;
    private double diem;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }
}

public class Bai20_SapXepObject {

    public static void main(String[] args) {
        String ten;
        double diem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sv: ");
        int n = Integer.parseInt(sc.nextLine());
        SinhVien sv[] = new SinhVien[n];
        for (int i = 0; i <= n; i++) {
            sv[i] = new SinhVien();
            System.out.println("Nhap ten sinh vien: ");
            ten = sc.nextLine();
            sv[i].setTen(ten);
            System.out.println("Nhap diem: ");
            diem = sc.nextDouble();
            sv[i].setDiem(diem);
            sc.nextLine();
        
        for (int j = 0; j < n; j++) {
            System.out.println("Ho va ten sinh vien: " + sv[j].getTen());
            System.out.println("Diem: " + sv[j].getDiem());
            if (sv[j].getDiem() < 5) {
                System.out.println("Hoc luc yeu");
            } else if (sv[j].getDiem() <= 6) {
                System.out.println("Hoc luc trung binh");
            } else if (sv[j].getDiem() < 8) {
                System.out.println("Hoc luc kha");
            } else {
                System.out.println("Hoc luc gioi");
            }
        }
        }
            
        for(int x=0;x<n;x++){
            for(int y=x+1;y<n;y++){
                if(sv[x].getDiem()<sv[y].getDiem()){
                    SinhVien tam = new SinhVien();
                    tam = sv[x];
                    sv[x]= sv[y];
                    sv[y]=tam;
                }
            }
        }
    }
}
            
    
    

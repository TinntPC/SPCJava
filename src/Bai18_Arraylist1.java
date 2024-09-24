
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai18_Arraylist1 {

    public static void main(String[] args) {
        System.out.println("HOC VE ARRYLIST");
        ArrayList ds = new ArrayList();
        ArrayList b = new ArrayList();
        
        for (int i = 0;i<10;i++)
        {
            ds.add(i);
        }
        
            ds.add("hehe");
            ds.removeFirst();
            ds.remove(6);
            System.out.println("ArrayList b: ");
            for (int i=0;i<ds.size();i++)
            {
                System.out.println(ds.get(i)+" ");
            }
        
    }
}

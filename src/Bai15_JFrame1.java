/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class Bai15_JFrame1 {
    public static void main(String[] args) {
        //Tạo một JFrame mới !!!
        JFrame frame = new JFrame ("Ví dụ JFrame đơn giản:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400); //Kích thước của cửa sổ
        
        // Tạo một Panel
        JPanel panel = new JPanel();
        
        //Tạo nút bấm
        JButton button = new JButton("Hãy nhấn vào tôi !!");
        
        //Thêm nút vào JPanel
        panel.add(button);
        
        //Thêm JPanel vào JFrame
        frame.add(panel);
        
        //Hiển thị của sổ
        frame.setVisible(true);
    }
}

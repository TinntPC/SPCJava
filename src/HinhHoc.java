/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class HinhHoc {
    public abstract class Hinhhoc{
        private int dai;
        private int rong;
        public abstract double tinhChuVi();
        public abstract double tinhDienTich();
        public Hinhhoc(int dai, int rong){
            super();
            this.dai=dai;
            this.rong=rong;
        }
        public Hinhhoc(){
            super();
        }
        public int getDai(){
            return dai;
        }
        public void setDai(int dai){
            this.dai=dai;
        }public int getRong(){
            return rong;
        }
        public void setRong(int rong){
            this.rong = rong;
        }
    }
}

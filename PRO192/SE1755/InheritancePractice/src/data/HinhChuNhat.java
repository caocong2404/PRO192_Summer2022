
package data;

import java.util.Scanner;


public class HinhChuNhat extends HinhHoc {
    
    private double chieuDai, chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public HinhChuNhat() {
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public double getchuViR(){
        
         return (chieuDai + chieuRong) * 2;
    }
    
    public double getdienTichR(){
        return chieuDai * chieuRong;
    }
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        double chieuDai, chieuRong;
        
        try {
            System.out.print("Nhap chieu dai: ");
            chieuDai = Float.parseFloat(sc.nextLine());
            System.out.print("Nhap chieu rong: ");
            chieuRong = Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            System.out.println("Nhap lai!!");
        }
        
    }
    
    @Override
    public void output(){ 
        System.out.println("ChuVi =" + getchuViR() + "\nDienTich = " + getdienTichR());
    }

    @Override
    public void tinhChuViDienTinh() {
        super.dienTich = chieuDai * chieuRong;
        chuVi    = (chieuDai + chieuRong) * 2; 
    }

    
    
    
    
}

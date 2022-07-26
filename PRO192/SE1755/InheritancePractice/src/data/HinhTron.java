
package data;


public class HinhTron extends HinhHoc{
    
    private float banKinh;
    public static final double PI = 3.14;

    public HinhTron() {
    }
    
    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }
    
    
    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }
    
    public double TinhchuVi(){
        return 2 * banKinh * PI; 
    }

    public double TinhdienTich(){
        return PI * Math.pow(PI, 2);
    }

    @Override
    public void output() {
        System.out.println("ChuVi =" + TinhchuVi() + "\nDienTich = " + TinhdienTich());
    }

    @Override
    public void input() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tinhChuViDienTinh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

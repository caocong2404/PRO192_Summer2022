
package data;


public abstract class HinhHoc {
    
    protected double chuVi;
    protected double dienTich;

    public abstract void input();
    public abstract void tinhChuViDienTinh();
    public abstract void output();
    
    public void output2(){
        System.out.println("Chu Vi = " + chuVi + "\nDien Tich = " + dienTich);
    }
    
}

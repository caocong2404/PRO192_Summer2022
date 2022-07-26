
package inheritancepractice;

import data.HinhChuNhat;
import data.HinhHoc;
import data.HinhTron;


public class InheritancePractice {

   
    public static void main(String[] args) {
        HinhHoc a1 = new HinhChuNhat(3, 4);
        a1.tinhChuViDienTinh();
        a1.output2();
        
        HinhChuNhat a2 = new HinhChuNhat(7, 10);
//        a2.output();
        
        HinhHoc b1 = new HinhTron(6);
        
        HinhHoc b2 = new HinhTron(10);
        
        
        
    }
    
}

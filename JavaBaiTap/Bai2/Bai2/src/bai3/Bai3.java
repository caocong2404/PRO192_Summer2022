package bai3;

import data.BankAccount;

public class Bai3 {
    
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount(123, "Cao Van Cong", 372106, 722998, 100000);
        Acc1.withDraw();
        
        BankAccount Acc2 = new BankAccount(124, "Nguyen Tran Tin", 372107, 722999, 15000);
        Acc2.withDraw();
        Acc2.setMoneyUp(500000);
        Acc2.setMoneyDown(300000);
        
        
        
    }
    
}

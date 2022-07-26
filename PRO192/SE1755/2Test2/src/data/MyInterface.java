
package data;


public interface MyInterface {
    final int MAXN = 100;
    int n = 0;
    
    //static method
    static public int sqrt(int x) {
        return x * x;
    }
    
    //abstract method
    public abstract void m2();
    
    //default method
    default void m3(){
        System.out.println("Hello");
    }
                        
}

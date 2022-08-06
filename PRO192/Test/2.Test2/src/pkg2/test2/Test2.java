package pkg2.test2;

 class A  {
     public String f(int x){
     return "AA";
     }
     
     public String f(int... vals){
     return "BB";
     }
  
}

class B {
}

interface W {

    void cook();
}

public class Test2 {

    public static void main(String[] args) {
        Test2 test = new Test2();
        A a = new A();
        System.out.println(a.f(123));
    }

}

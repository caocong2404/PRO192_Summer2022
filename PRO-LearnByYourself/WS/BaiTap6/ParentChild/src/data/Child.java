package data;

public class Child extends Parent {
    

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset 1: " + assetOne + "; asset 2: " + assetTwo);
    }
    
    public void sayHi(){
        System.out.println("Hey, I am a rich kid");
    }
    
}

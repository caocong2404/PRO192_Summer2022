package data;

public class Child extends Parent {
    
    private String assetThree; //Retangle vs Square(o, c, e)
                               //                   (o, c, e, smile)

    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset 1: " + assetOne + 
                                 "; asset 2: " + assetTwo +
                                 "; asset 3: " + assetThree);
    }
    
    public void sayHi(){
        System.out.println("Hey, I am a rich kid");
        System.out.println("By the way, my 3rd asset is " + assetThree);
    }
    
    
    
    

}

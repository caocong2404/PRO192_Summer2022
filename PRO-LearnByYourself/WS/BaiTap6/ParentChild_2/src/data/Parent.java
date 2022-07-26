package data;

public class Parent {

    protected String assetOne;
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    public void showProfile() {
        System.out.println("PARENT > asset 1: " + assetOne + "; asset 2: " + assetTwo);
    }

}

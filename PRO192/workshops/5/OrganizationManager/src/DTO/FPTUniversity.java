
package DTO;


public class FPTUniversity extends University implements Role{
    
    private String adddress;

    public FPTUniversity(int size, String name, String adddress) {
        super(size, name);
        this.adddress = adddress;
    }

    public FPTUniversity() {
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }
}

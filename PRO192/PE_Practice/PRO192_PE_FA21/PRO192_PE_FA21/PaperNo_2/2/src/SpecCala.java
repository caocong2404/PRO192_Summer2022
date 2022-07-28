
public class SpecCala extends Cala {
    
    private int color;

    public SpecCala() {
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
        
    public void setData(){
        String data = super.getOwner();
        super.setOwner(data.substring(0, 1) + "XX" + data.substring(2, data.length()));
    }
    
    public int getValue(){
        if (color % 2 != 0)
            return super.getPrice() + 3;
        return super.getPrice() + 7;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + ", " +  color;
    }
    
    
    
    
}

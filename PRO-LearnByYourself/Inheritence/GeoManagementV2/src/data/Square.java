
package data;

public class Square extends Retangle{
    
    private String smile;

    public Square(String owner, String color, String borderColor, String smile, double edge) {
        super(owner, color, borderColor, edge, edge);
        this.smile = smile;
    }


    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }
    
    @Override
    public void paint(){
        System.out.printf("%-10s|%-10s|%-10s|%-10s|%4.1f|%3s |%7.2f|\n"
                , "SQUARE", owner, color, borderColor, a, smile, getArea());
    }

}

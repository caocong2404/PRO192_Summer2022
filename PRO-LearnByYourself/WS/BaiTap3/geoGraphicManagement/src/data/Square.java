
package data;

public class Square extends Retangle {

    public Square(String name, double edge, String color) {
        super(name, edge, edge, color);
    }
    
    @Override
    public void paint(){
        System.out.printf("\nSQUARE: %-8s|%4.1f|%-8s\n", name, length, color);
    }
    
        
    }
    
//nha que
//    private String name;
//    private double size;
//    private String color;
//    
//    public Square (String name, double size, String color){
//        this.name = name;
//        this.size = size;
//        this.color = color;
//    }
//    
    
//
//    @Override
//    public String toString() {
//        return String.format("%-8s|%4.1f |%-8s", name, size, color);
//    }
    


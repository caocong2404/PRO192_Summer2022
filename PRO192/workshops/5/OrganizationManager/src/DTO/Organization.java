
package DTO;


public abstract class Organization {
    
    protected int size;

    public abstract void communicateByTool();
    
    public Organization(int size) {
        this.size = size;
    }

    public Organization() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "The organization’s size is " + size;
    }
    
    
}

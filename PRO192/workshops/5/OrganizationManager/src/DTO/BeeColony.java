package DTO;

public class BeeColony extends Colony implements Role {

    private String type;

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    public BeeColony() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "The colony’s type is " + type + " size is about " + size + " and the place is " + place;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}

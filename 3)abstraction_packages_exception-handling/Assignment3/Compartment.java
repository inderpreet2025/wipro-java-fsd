public class Compartment {

    private int height;
    private int width;
    private int breadth;

    public Compartment(int height, int width, int breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        Compartment compartment = new Compartment(10, 20, 30);
        System.out.println("Height: " + compartment.getHeight());
        System.out.println("Width: " + compartment.getWidth());
        System.out.println("Breadth: " + compartment.getBreadth());
    }
}
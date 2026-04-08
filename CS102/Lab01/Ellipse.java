public class Ellipse extends GeometricShape2D {

    private float x;
    private float y;

    public Ellipse(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public float calculateArea() {
        return (float) Math.PI * x * y;
    }

    @Override
    void printInfo() {
        System.out.println("Ellipse with radius 1: " + x + " and radius 2: " + y);
    }

    
}

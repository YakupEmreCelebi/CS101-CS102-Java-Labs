public class Circle extends GeometricShape2D {

    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }


    @Override
    public float calculateArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    void printInfo() {
        System.out.println("Circle with radius " + radius);
    }
    
}

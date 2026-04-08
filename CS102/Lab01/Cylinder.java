public class Cylinder extends GeometricShape3D {

    private float radius;
    private float height;

    public Cylinder(float radius, float height){

        this.radius = radius;
        this.height = height;
    }

    @Override
    public float calculateVolume() {
        return (float) Math.PI * radius * radius * height;
    }

    @Override
    void printInfo() {
        System.out.println("Cylinder, radius: " + radius + ", heigth: " + height);
        
    }

    @Override
    float calculateArea() {
        return (float) Math.PI * 2 * radius * radius + (float) Math.PI * 2 * radius * height;
    }
    
}

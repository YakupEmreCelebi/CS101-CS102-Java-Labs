public class Sphere extends GeometricShape3D {
    private float radius;

    public Sphere(float radius){
        this.radius = radius;
    }

    @Override
    public float calculateVolume() {
        return (float)( Math.PI * radius * radius * radius *  4.0 / 3.0);
    }

    @Override
    void printInfo() {
        System.out.println("Sphere, radius: " + radius);
        
    }

    @Override
    float calculateArea() {
        return (float) Math.PI * 4 * radius * radius;
    }
    
}

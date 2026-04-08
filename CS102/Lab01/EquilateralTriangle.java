public class EquilateralTriangle extends GeometricShape2D {

    private float z;

    public EquilateralTriangle(float z){
        this.z = z;
    }

    @Override
    public float calculateArea() {
        return (float) ( z * z * Math.pow(3, 1.0/2) / 4.0);
    }

    @Override
    void printInfo() {
        System.out.println("Equilateral Triangle with " + z);
    }
    
}

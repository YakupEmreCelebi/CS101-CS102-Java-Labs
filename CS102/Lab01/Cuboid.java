public class Cuboid extends GeometricShape3D{

    private float x;
    private float y;
    private float z;

    public Cuboid(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public float calculateVolume() {
        return x * y * z;
    }

    @Override
    void printInfo() {
        System.out.println("Cuboid, length: " + x + ", breadth: " + y + " ,height: " + z);
        
    }

    @Override
    float calculateArea() {
        return 2 * (x*y + y*z + x*z);
    }
}

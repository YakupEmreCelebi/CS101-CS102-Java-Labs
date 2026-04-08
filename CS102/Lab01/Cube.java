public class Cube extends GeometricShape3D {
    private float x;

    public Cube(float x){
        this.x = x;
    }

    @Override
    public float calculateVolume() {
        return x * x * x;
    }

    @Override
    public void printInfo() {
        System.out.println("Cube, edge length " + x);
        
    }

    @Override
    public float calculateArea() {
        return 6 * x * x;
    }


    
}

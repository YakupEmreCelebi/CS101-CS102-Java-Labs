public class Pyramid extends GeometricShape3D{

    private float sideLength;
    private float height;

    public Pyramid(float height, float length){
        this.sideLength = length;
        this.height = height;
    }

    @Override
    public float calculateVolume() {
        return (float)( height * sideLength / 3.0);
    }

    @Override
    public void printInfo() {
        System.out.println("Pyramid, length: " + sideLength + ", heigth: " + height);
    }

    @Override
    public float calculateArea() {
        return 2 * sideLength * height + sideLength * sideLength;
    }

    
}

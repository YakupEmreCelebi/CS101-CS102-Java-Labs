public class Rectangle extends GeometricShape2D {

    protected float x;
    protected float y;

    public Rectangle(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public float calculateArea(){
        return x * y;
        
    }
    
    @Override
    public void printInfo() {
        System.out.println("Rectangle with " + y + " width and " + x + " height");
    }
}

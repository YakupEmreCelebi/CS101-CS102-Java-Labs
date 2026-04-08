public class Square extends Rectangle{

    public Square(float x){
        super(x, x);
    }

    @Override
    public float calculateArea() {
        return super.calculateArea();
    }

    @Override
    public void printInfo() {
        System.out.println("Square with " + y);
    }
    
}

public class MultiShape2D extends GeometricShape2D {

    private GeometricShape2D [] shapeArray;

    public MultiShape2D(){
        shapeArray = new GeometricShape2D[0];
    }

    @Override
    public float calculateArea() {
        int totalArea = 0;
        for(GeometricShape2D shape : shapeArray)
        {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    @Override
    public void printInfo() {
        if(shapeArray.length != 0)
        {
            System.out.println("Multi-shape, area: " + calculateArea());
        }
        else
        {
            System.out.println("Multi shape, no shape in it");
        }
        
    }

    public void addShape(GeometricShape2D shape){
        
        if(shapeArray.length != 0)
        {
            GeometricShape2D [] newArray = new GeometricShape2D[shapeArray.length + 1];
            int i;
            for(i = 0; i<shapeArray.length; i++)
            {
                newArray[i]  = shapeArray[i];
            }
            newArray[i] = shape;
            shapeArray = new GeometricShape2D[i+1];
            shapeArray = newArray;
        }
        else
        {
            shapeArray = new GeometricShape2D[1];
            shapeArray[0] = shape;
        }
    }

    public void mergeShapes()
    {
        float totalArea = 0;
        for(int i=0; i<shapeArray.length; i++)
        {
            totalArea += shapeArray[i].calculateArea();
        }
        shapeArray = new GeometricShape2D[1];
        shapeArray[0] = new Square((float) Math.pow(totalArea, 1.0/2.0));
    }

    public GeometricShape2D [] getShapeArray(){
        return shapeArray;
    }

    public void printArrayInfo() 
    {
        if(shapeArray.length != 0)
        {
            System.out.println("Multi shape: ");
            for(int i=0; i<shapeArray.length; i++)
            {
                if(shapeArray[i] != null)
                {
                    System.out.print("- ");
                    if( shapeArray[i].getClass().getName().equals("MultiShape2D"))
                    {
                        ((MultiShape2D) shapeArray[i]).printArrayInfo();
                    }
                    else
                    {
                        shapeArray[i].printInfo();
                    }
                    
                }
            }
        }
    }
    
}

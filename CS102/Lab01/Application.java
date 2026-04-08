import java.util.Scanner;


public class Application {

    public static GeometricShape2D [] addShape(GeometricShape2D [] shapes , GeometricShape2D shape){
        GeometricShape2D [] newShapes = new GeometricShape2D[shapes.length + 1];
        for(int i=0; i<shapes.length; i++)
        {
            newShapes[i] = shapes[i];
        }
        newShapes[newShapes.length-1] = shape;
        shapes = newShapes;
        return shapes;
    }

    public static GeometricShape2D Edit(GeometricShape2D [] shapes , int choice)
    {
        Scanner in = new Scanner(System.in);
        if(shapes[choice].getClass().getName().equals("Circle"))
        {
            System.out.print("Enter new radius: ");
            int radius = in.nextInt();
            Circle newCircle = new Circle(radius);
            shapes[choice] = newCircle;
        }
        else if(shapes[choice].getClass().getName().equals("Cube"))
        {
            System.out.print("Enter new length: ");
            int length = in.nextInt();
            Cube newCube = new Cube(length);
            shapes[choice] = newCube;
        }
        else if(shapes[choice].getClass().getName().equals("Cuboid"))
        {
            System.out.print("Enter new length: ");
            int length = in.nextInt();
            System.out.print("Enter new width: ");
            int width = in.nextInt();
            System.out.print("Enter new breadt: ");
            int breadt = in.nextInt();
            Cuboid newCuboid = new Cuboid(length, width,breadt);
            shapes[choice] = newCuboid;
        }
        else if(shapes[choice].getClass().getName().equals("Cylinder"))
        {
            System.out.print("Enter new radius: ");
            int radius = in.nextInt();
            System.out.print("Enter new heigth: ");
            int height = in.nextInt();
            Cylinder newCylinder = new Cylinder(radius, height);
            shapes[choice] = newCylinder;
        }
        else if(shapes[choice].getClass().getName().equals("Ellipse"))
        {
            System.out.print("Enter new radius1: ");
            int radius1 = in.nextInt();
            System.out.print("Enter new radius2: ");
            int radius2 = in.nextInt();
            Ellipse newEllipse = new Ellipse(radius1, radius2);
            shapes[choice] = newEllipse;
        }
        else if(shapes[choice].getClass().getName().equals("EquilateralTriangle"))
        {
            System.out.print("Enter new length: ");
            int length = in.nextInt();
            EquilateralTriangle newTriangle = new EquilateralTriangle(length);
            shapes[choice] = newTriangle;
        }
        else if(shapes[choice].getClass().getName().equals("Pyramid"))
        {
            System.out.print("Enter new heigth: ");
            int height = in.nextInt();
            System.out.print("Enter new length: ");
            int length = in.nextInt();
            Pyramid newCylinder = new Pyramid(height, length);
            shapes[choice] = newCylinder;
        }
        else if(shapes[choice].getClass().getName().equals("Rectangle"))
        {
            System.out.print("Enter new width: ");
            int width = in.nextInt();
            System.out.print("Enter new heigth: ");
            int heigth = in.nextInt();
            Rectangle newCylinder = new Rectangle(width, heigth);
            shapes[choice] = newCylinder;
        }
        else if(shapes[choice].getClass().getName().equals("Sphere"))
        {
            System.out.print("Enter new radius: ");
            int radius = in.nextInt();
            Sphere newCircle = new Sphere(radius);
            shapes[choice] = newCircle;
        }
        else if(shapes[choice].getClass().getName().equals("Square"))
        {
            System.out.print("Enter new length: ");
            int length = in.nextInt();
            Square newCircle = new Square(length);
            shapes[choice] = newCircle;
        }
        return shapes[choice];
    }

    public static GeometricShape2D checkForShape(String shape){
        Scanner in = new Scanner(System.in);
        if(shape.equalsIgnoreCase("Square"))
        {
            System.out.print("Enter height: ");
            return new Square(in.nextInt());
        }
        else if(shape.equalsIgnoreCase("EquilateralTriangle"))
        {
            System.out.print("Enter length: ");
            return new EquilateralTriangle(in.nextInt());
        }
        else if(shape.equalsIgnoreCase("Cube"))
        {
            System.out.print("Enter length: ");
            return new Cube(in.nextInt());
        }
        else if(shape.equalsIgnoreCase("Sphere"))
        {
            System.out.print("Enter radius: ");
            return new Sphere(in.nextInt());
        }
        else if(shape.equalsIgnoreCase("Circle"))
        {
            System.out.print("Enter radius: ");
            return new Circle(in.nextInt());
        }
        else if(shape.equalsIgnoreCase("Rectangle"))
        {
            System.out.print("Enter width: ");
            int width = in.nextInt();
            System.out.print("Enter height: ");
            int height = in.nextInt();
            return new Rectangle(width,height);
        }
        else if(shape.equalsIgnoreCase("Pyramid"))
        {
            System.out.print("Enter side length: ");
            int width = in.nextInt();
            System.out.print("Enter height: ");
            int height = in.nextInt();
            return new Pyramid(width,height);
        }
        else if(shape.equalsIgnoreCase("Cuboid"))
        {
            System.out.print("Enter width: ");
            int width = in.nextInt();
            System.out.print("Enter height: ");
            int height = in.nextInt();
            System.out.print("Enter breadth: ");
            int breadth = in.nextInt();
            return new Cuboid(width,height,breadth);
        }
        else if(shape.equalsIgnoreCase("Ellipse"))
        {
            System.out.print("Enter radius 1: ");
            int radius1 = in.nextInt();
            System.out.print("Enter radius 2: ");
            int radius2 = in.nextInt();
            return new Rectangle(radius1,radius2);
        }
        else if(shape.equalsIgnoreCase("Cylinder"))
        {
            System.out.print("Enter radius: ");
            int radius = in.nextInt();
            System.out.print("Enter heigth: ");
            int heigth = in.nextInt();
            return new Cylinder(radius,heigth);
        }
        else if(shape.equalsIgnoreCase("Multi-Shape"))
        {
            return new MultiShape2D();
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        GeometricShape2D [] shapes = new GeometricShape2D[0];

        System.out.println("1. Create and Store a New Shape: ");
        System.out.println("2. Add an Existing Shape to a Multi-shape: ");
        System.out.println("3. List All Shapes:");
        System.out.println("4. Merge");
        System.out.println("5. Edit");

        int option;
        boolean isContinue = true;
        while(isContinue)
        {
            System.out.print("Choose an option: ");
            option = in.nextInt();
            in.nextLine();

            if(option == 1)
            {
                System.out.println("Possible shapes: ");
                System.out.println("Circle \nRectangle \nSquare \nEllipse \nEquilateral Triangle \nCuboid \nSphere \nCylinder \nCube \nPyramid \nMuiti-Shape");
                System.out.println("Choose one: ");
                String choiceShape = in.nextLine();
                GeometricShape2D shape = checkForShape(choiceShape);
                shapes = addShape(shapes, shape);

                for(int i=0; i<shapes.length; i++)
                {
                    if(shapes[i] != null)
                    {
                        shapes[i].printInfo();
                    }
                }
               
                
            }
            else if(option == 2)
            {
                for(int i=0; i<shapes.length; i++)
                {
                    if(shapes[i] != null)
                    {
                        if(shapes[i].getClass().getName().equals("MultiShape2D"))
                        {
                            System.out.print(i + ". ");
                            shapes[i].printInfo();
                        } 
                    }
                    
                }
                System.out.print("Choose one multi-shape: ");
                int multiShapeChoice = in.nextInt();
                for(int i=0; i<shapes.length; i++)
                {
                    if(shapes[i] != null)
                    {
                        if(i != multiShapeChoice)
                        {
                            System.out.print(i + ". ");
                            shapes[i].printInfo();
                        } 
                    }
                    
                }
                System.out.print("Choose shape to add: ");
                int shapeOption = in.nextInt();
                MultiShape2D multiShape = (MultiShape2D) shapes[multiShapeChoice];
                multiShape.addShape(shapes[shapeOption]);
                shapes[multiShapeChoice] = multiShape;
                shapes[shapeOption] = null;
            }
            else if(option == 3)
            {
                
                    int k = 0;
                    System.out.println("2D Shapes: ");
                    System.out.println();
                    for(int i=0; i<shapes.length; i++)
                    {
                        if(shapes[i] != null && (shapes[i].getClass().getSuperclass().getName().equals("GeometricShape2D") || shapes[i].getClass().getSuperclass().getName().equals("GeometricShape2D")))
                        {
                            System.out.print("[" + k + "]");
                            shapes[i].printInfo();
                            k++; 
                        }
                    }
                    System.out.println("3D Shapes:");
                    System.out.println();
                    for(int i=0; i<shapes.length; i++)
                    { 
                        if(shapes[i] != null && shapes[i].getClass().getSuperclass().getName().equals("GeometricShape3D") )
                        {
                            System.out.print("[" + k + "]");
                            shapes[i].printInfo();
                            k++; 
                        }
                    }
                    GeometricShape2D [] newArray = new GeometricShape2D[k];
                    k = 0;
                    for(int i=0; i<shapes.length; i++)
                    {
                        if(shapes[i] != null && (shapes[i].getClass().getSuperclass().getName().equals("GeometricShape2D") || shapes[i].getClass().getSuperclass().getName().equals("GeometricShape2D")))
                        {
                            newArray[k] = shapes[i];
                            k++; 
                        }
                    }
                    for(int i=0; i<shapes.length; i++)
                    { 
                        if(shapes[i] != null && shapes[i].getClass().getSuperclass().getName().equals("GeometricShape3D") )
                        {
                            newArray[k] = shapes[i];
                            k++; 
                        }
                    }
                    System.out.println("Do you want details for a specific shape?");
                    System.out.print("Enter shape index or -1 to return: ");
                    int choice = in.nextInt();
                    
                    if(newArray[choice].getClass().getName().equals("MultiShape2D"))
                    {
                        newArray[choice].printInfo();
                        MultiShape2D multiShape = (MultiShape2D) newArray[choice];
                        multiShape.printArrayInfo();
                        
                    }
                
                
            }
            else if(option == 4)
            {
                for(int i=0; i<shapes.length; i++)
                {
                    if(shapes[i] != null && shapes[i].getClass().getName().equals("MultiShape2D"))
                    {
                        MultiShape2D newMultiShape = (MultiShape2D) shapes[i];
                        newMultiShape.mergeShapes();
                        shapes[i] = newMultiShape;
                        shapes[i].printInfo();
                    }
                }
            }
            else if(option == 5)
            {
                System.out.println("Editable shapes: ");
                for(int i=0; i<shapes.length; i++)
                {
                    if(shapes[i] != null && !(shapes[i].getClass().getName().equals("MultiShape2D")))
                    {
                        System.out.print("[" + i + "]");
                        shapes[i].printInfo();
                    }
                }
                System.out.println("Choose one: ");
                int choice = in.nextInt();
                Edit(shapes, choice);
            }
            else if(option == 6)
            {
                isContinue = false;
            }
        }
        
    }
    
}

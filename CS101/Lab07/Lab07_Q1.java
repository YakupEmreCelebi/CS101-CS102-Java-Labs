package lab7;

public class Lab07_Q1 {

    public static int [][] multiplyMatrices(int [][] matrixOne, int [][] matrixTwo){
        int [] a = matrixTwo[0];
        int [][] returnMatrix = new int [matrixOne.length][a.length];
        int sum=0;
        for(int i=0; i < matrixOne.length; i++)
        {
            sum = 0;
            for(int j=0; j<a.length; j++)
            {
                sum = 0;
                for(int k=0; k< matrixTwo.length; k++)
                {
                    sum = sum + (matrixOne[i][k] * matrixTwo[k][j]);
                }
                returnMatrix[i][j] = sum;
            }
             
        }
        return returnMatrix;
    }
    public static void printMatrix(int [][] matrixOne){
        int [] a = matrixOne[0];
        for(int i=0; i<matrixOne.length; i++)
         {
            
            for(int j=0; j<a.length; j++)
            {
                System.out.printf( "%4s" ,matrixOne[i][j] );
            }
            if(i!=matrixOne.length -1)
            {
                System.out.println();
            }
            
         }
    }
    public static String checkRectangular(int [][] matrix){
        String result ="";
        boolean boolLower = true;
        boolean boolUpper = true;
        int [] a = matrix[1];
        int j=1;
        int k=0;
        int m=1;
        int n=0;
        while(j < a.length && matrix[0][j] == 0 )
        {
            j++;
        }
        if(j==a.length)
        {
            boolLower = true;
            
        }
        else
        {
            boolLower = false;
        }
        if(boolLower)
        {
            while(k < matrix.length - 1 && matrix[k][a.length-1] == 0 )
            {
                k++;
            }
            if(k == matrix.length - 1)
            {
                boolLower = true;
            }
            else
            {
                boolLower = false;
            }
        }
        while( m < matrix.length && matrix[m][0] == 0 )
        {
            m++;
        }
        if(m == matrix.length)
        {
            boolUpper = true;
        }
        else
        {
            boolUpper = false;
        }
        if(boolUpper)
        {
            while( n < a.length - 1 && matrix[matrix.length -1][n] == 0)
            {
                n++;
            }
            if(n == a.length - 1)
            {
                boolUpper = true;
            }
            else
            {
                boolUpper = false;
            }
        }
        if(boolLower)
        {
            result =  "Lower Triangular";
        }
        else if(boolUpper)
        {
            result = "Upper Triangular";
        }
        else
        {
            result = "Neither";
        }
        
        return result;
    }
    public static boolean isSubset(int [][] parent, int [][] child){
        boolean result = true;
        int [] childA  = child[0];
        int [] parentA = parent[0];
        
        if(elemansSame(parent, child))
        {
            for(int i=0; i< child.length; i++)
           {
            
                for(int j=0; j< parent.length; j++)
                {
                    result = false;
                    if(subset(child[i], parent[j], childA.length, parentA.length))
                    {
                        result = true;
                    }
                }
                
            }
        }
        return result;
    }

    static boolean subset(int array1[], int array2[], int x, int y) {
        int i, j = 0;
        for (i = 0; i < y; i++) {
           for (j = 0; j < x; j++)
              if (array2[i] == array1[j])
                 break;
            
           if (j == x)
              return false;
        }
        return true;
     }
   
    public static boolean elemansSame(int [][] parent, int [][] child){
        boolean result = true;
        int [] childA  = child[0];
        int [] parentA = parent[0];
        for(int i=0; i<childA.length; i++)
        {
            for(int j=0; j<child.length; j++)
            {
                result = false;
                for(int k=0; k<parentA.length; k++)
                {
                    for(int l=0; l<parent.length; l++)
                    {
                        if(child [j][i] == parent [l][k])
                        {
                            result = true;
                            
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrixOne =
        {
        {1, 2, 3},
        {4, 5, 6}
        };
        int[][] matrixTwo = 
        {
        {7, 8},
        {9, 10},
        {11, 12}
        };
        int[][] matrixSquare =
        {
        {0, 0, 1},
        {0, 1, 0},
        {0, 0, 1}
        };
        int[][] childMatrix = {
            {1, 5},
            {8, 9}
            };
            int[][] parentMatrix = {
                {1, 0, 2, 3},
                {4, 1, 5, 6},
                {7, 8, 9, 10}
                };
            
        int [] a = matrixTwo[1];

        System.out.println("\nMatrix One: ");
        printMatrix(matrixOne);
        System.out.println("\nMatrix Two:");
        printMatrix(matrixTwo);
        System.out.print("\nMultiplication Result:");
                
         int [][] multplyMatrix = multiplyMatrices(matrixOne, matrixTwo);
         for(int i=0; i<matrixOne.length; i++)
         {
            System.out.println();
            for(int j=0; j<a.length; j++)
            {
                System.out.printf( "%4s" ,multplyMatrix[i][j] );
            }
         }
         System.out.println("\nChecking if matrix is rectangular:");
         printMatrix(matrixSquare);
        System.out.println();
       
         System.out.println(checkRectangular(matrixSquare));
         System.out.println("parent");
         printMatrix(parentMatrix);
         System.out.println("\nchild");
         printMatrix(childMatrix);

         int [] test1 = {1,2,3,4,5};
         int [] test2 = {3,4,5,6};
         System.out.println("\ntest1" + "    1,2,3,4,5");
         System.out.println("test2" + "    3,4,5,6");
         System.out.println(subset(test1,test2,5,4));
         System.out.println(isSubset(parentMatrix, childMatrix));
            
    }
    
}

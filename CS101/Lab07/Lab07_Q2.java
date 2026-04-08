package lab7;

public class Lab07_Q2 {
    public static void joinQueue(int orderedLoafs, int[] queue){
        if(orderedLoafs != 1)
        {
            for(int i=0; i<20; i++)
            {
                if(queue[i] == 0)
                {
                    queue[i] = orderedLoafs;
                    break;
                }
            }
        }
        else if(orderedLoafs == 1)
        {
            
        }
        
    }
    public static void main(String[] args) {
        int[] queue = new int[20];
        joinQueue(2, queue);
        joinQueue(3, queue);
        joinQueue(4, queue);
        joinQueue(1, queue);
        for(int i=0; i<20; i++)
        {
            System.out.print(queue[i] + " ");
        }
    }
    
}

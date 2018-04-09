package scherlitzryanassignment6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LongTask extends Thread 
{

    /*
    Variable initialization
     */
    private final int start;
    private final int end;
    private final SharedResults sharedData;

    /*
    Thread Constructor
    */
    LongTask(int start, int end, SharedResults sharedData)
    {
        this.start = start;
        this.end = end;
        this.sharedData = sharedData;
        
        
    }
    
    
    
    @Override
    public void run()
    {
        int sum = 0;
        /*
        set thread name
        */
        Thread.currentThread().setName("Thread_" + start + "_" + end);
        
        for(int i = start; i <= end; i++)
        {
            sum += i;
            
            try 
            {
                Thread.sleep((long)(Math.random() + 10));
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(LongTask.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        sharedData.addToResults(sum);
        
    }
}

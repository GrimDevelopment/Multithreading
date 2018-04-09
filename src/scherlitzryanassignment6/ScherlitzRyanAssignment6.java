package scherlitzryanassignment6;

import java.util.logging.Level;
import java.util.logging.Logger;



public class ScherlitzRyanAssignment6
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try {
            /*
            Variable initialization
            */
            SharedResults results = new SharedResults();
            
            
            /*
            Create and start threads
            */
            LongTask threadOne = new LongTask(1, 100, results); threadOne.start();
            LongTask threadTwo = new LongTask(101, 200, results); threadTwo.start();
            LongTask threadThree = new LongTask(201, 300, results); threadThree.start();
            LongTask threadFour = new LongTask(301, 400, results); threadFour.start();
            LongTask threadFive = new LongTask(401, 500, results); threadFive.start();
            
            /*
            Wait for threads 
            */
            for(Thread thread: new Thread[] {threadOne, threadTwo, threadThree, threadFour, threadFive})
            {
                thread.join();
            }
            
            /*
            Print out the results
            */
            System.out.print("Result: " + results.getResults() + "\n");
        } 
        catch (InterruptedException ex)
        {
            Logger.getLogger(ScherlitzRyanAssignment6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
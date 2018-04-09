package scherlitzryanassignment6;

public class SharedResults {
    
    /*
    Variables
    */
    private int result;
    
    /*
    add input to results. 
    */
    synchronized void addToResults(int result)
    {
        
        int cumulativeResult = this.result += result;
        System.out.print(Thread.currentThread().getName() + " is adding " + result + ", Cumulative Result is: " + cumulativeResult + "\n");
    }
    
    synchronized int getResults()
    {
        return result;
    }
}

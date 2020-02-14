import java.util.ArrayList;

public class Queue <T> implements QueueInterface<T>
{
    private ArrayList<T> list;

    public Queue()
    {
        this.list = new ArrayList<T> ();
    }//end default constructor

    /** Adds a new entry to the back of this queue.
     *  @param newEntry An object to be added.
     */
    public void enqueue (T newEntry)
    {
        list.add(newEntry);
    }
    
    /** Removes and returns the entry at the front of this queue.
    @return  The object at the front of the queue. 
    @throws  EmptyQueueException if the queue is empty before the operation. */
    public T dequeue() throws EmptyQueueException
    {
        if (isEmpty())
            throw new EmptyQueueException("The list is empty!");
        else
            return list.remove(0);
    }
    /**Retrieves the entry at the front of this queue.
	  *@return  The object at the front of the queue.
	   *@throws  EmptyQueueException if the queue is empty.
     */
    public T getFront()throws EmptyQueueException
    {
        if (isEmpty())
            throw new EmptyQueueException("The list is empty!");
        else
            return list.get(0);
    }
    
    

    @Override
    /** Detects whether this queue is empty.
    @return  True if the queue is empty, or false otherwise. */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /** Removes all entries from this queue. */
    public void clear ()
    {
        list.clear();
    }

    


   public static void main(String[] args) {
	   
	   try {
      
       Queue<Integer> qe = new Queue<Integer>();
       qe.enqueue(1);
       qe.enqueue(5);
       qe.enqueue(10);
       while(!qe.isEmpty()) {
    	   System.out.println(qe.getFront()+"");
    	   qe.dequeue();
       }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }

   }

}

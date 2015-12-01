public class Example
{
    public static void main(String[] args)
    {
    	//Here is the code that would give me a null pointer exception
    	/**
    	 * Object obj = null;
         *  obj.hashCode();
    	 */
    	 //Here is how I fix it
        Object obj = new Object();
        obj.hashCode();
    }
}

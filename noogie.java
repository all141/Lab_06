//Throws Exception when variable takes value of a non-perfect square
class noogieException extends Exception 
{
	      //Parameterless Constructor
	      public noogieException() {}

	      //Constructor that accepts a message
	      public noogieException(String message)
	      {
	         super(message);
	      }
	private static final long serialVersionUID = 1L; 
	public static void main(String[] args) 
	{
		String word = null;
		try 
		{
			if(word.contains(" "))
		     {
		          throw new noogieException();
		     }
		} catch (noogieException e) 
		{
			
		}
	}
}



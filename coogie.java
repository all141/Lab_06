//Throws Exception when variable takes value of a non-perfect square
class coogieException extends Exception 
{
	      //Parameterless Constructor
	      public coogieException() {}

	      //Constructor that accepts a message
	      public coogieException(String message)
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
		          throw new coogieException();
		     }
		} catch (coogieException e) 
		{
			
		}
	}
}


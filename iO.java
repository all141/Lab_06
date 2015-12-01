import java.io.*;
class Example
{  
   public static void main(String args[]) 
   {
	FileInputStream fis = null;
        fis = new FileInputStream("B:/myfile.txt"); 
	int k; 
	while(( k = fis.read() ) != -1) 
	{ 
		System.out.print((char)k); 
	} 
	fis.close(); 	
   }
}

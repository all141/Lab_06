import java.io.*;
class iO
{  
   public static void main(String args[]) 
   {
	FileInputStream fis = null;
        try {
			fis = new FileInputStream("myfile.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} 
	int k; 

	try {
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		}
	} catch (IOException e) {
		e.printStackTrace();
	} 

	try {
		fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	} 	
   }
}

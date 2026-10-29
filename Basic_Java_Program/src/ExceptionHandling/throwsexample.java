package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//https://www.youtube.com/watch?v=DOdRZk-kKYc&list=RDCMUC4C20Zelty7V0fuy5uTHdjQ&index=31

class ReadAndWrite
	{
		void readfile() throws FileNotFoundException  {
		FileInputStream fis= new FileInputStream("D:/Eclispe/Basic_Java_Program/src/Java_Notes.docx");
	}
	void saveFile() throws FileNotFoundException {
		FileOutputStream fos= new FileOutputStream("D:/xyz.txt");
	}
		
class throwsexample {
		
	public static void main(String[] args) {
				
				ReadAndWrite rw = new ReadAndWrite();
				try {
					rw.readfile();
				} 
				catch (FileNotFoundException e) {
					e.printStackTrace();
					
				}
				System.out.println("hello");
			}
			
			}
	}
	



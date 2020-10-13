import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.FileWriter; 
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
System.out.println("Enter the directory to Remove Attack Event ! (it will decrypt the file !!)");
System.out.println("EX:- /home/ubuntu/myFile.txt (or) C://directory");
		Scanner sc = new Scanner(System.in);
		String xyz=sc.nextLine();
		  String path = xyz;



try {

                // default StandardCharsets.UTF_8
                String sampleString = Files.readString(Paths.get(path));
             
		// Encrypt the string 
                System.out.println("");
		System.out.println("Ransomware Removed !!"); 
                 System.out.println("");
		String encryptedString = encryptDecrypt(sampleString); 
		

 
                 
                    FileWriter fw=new FileWriter(xyz);    
                    fw.write(encryptedString);    
                    fw.close();    
            
                  


 } 
catch (IOException e) {
            e.printStackTrace();
        }




 
	} 
} 

// This code is contributed by Vivekkumar Singh 


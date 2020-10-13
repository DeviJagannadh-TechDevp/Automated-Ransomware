#!bin/bash/


cat dj.txt

echo "Do you agree that you'll use this for eduvational purpose ? y/n "
read y
if [ $y = "y" ]
then
        echo "[WARNING]  Decrypt the file after Encryption !!!"
	echo " "
	echo "Choose the Options Below"
	echo " "
	echo "1 - To make a attack to a file (Encrypt the file)"
	echo "2 - To recover from attack (Decrypt the file)"
	read x
	if [ $x = "1" ]
	then   
                  
   		  java endj.java
                  cat en.txt
	else
                
    		java dedj.java
		cat de.txt
	
	fi
fi

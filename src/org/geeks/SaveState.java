package org.geeks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveState {
 public static void main(String[] args) throws IOException {
	 String loc="/home/aadhi00/eclipse-workspace/GeeksProject/state/state.txt";
	File f = new File(loc);
	FileInputStream fis = new FileInputStream(f);
	int count;
	if(f.length()==0)
		count=1;
	else
		count = fis.read();
	for (int i = 0; i < 10 ; i++) {
		System.out.println(count);
		count++;
	}
	System.out.println("Last state: "+count);
	FileOutputStream fos = new FileOutputStream(f);
	fos.write(count);		
}
}

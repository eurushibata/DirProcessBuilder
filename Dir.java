import java.util.*;
import java.lang.*;
import java.io.*;

public class Dir {
	public static void main(String [] args) {
		Scanner s = null;
		InputStream is;
		Process p;
        
		try{		
			p = new ProcessBuilder("/bin/ls").start();
            is = p.getInputStream();
            s = new Scanner(is);
            while(s.hasNext())
                System.out.println(s.nextLine());
		} catch(IOException ex) {
			System.out.println(ex);
		}
    } 
}

package qaprosoft.gufak.file.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.apache.log4j.Logger;

public class Guf {
	

	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		Date date = new Date(12323232323232L); /*DATE*/
		System.out.println(date);
		String s = "";
		Scanner in = new Scanner(new File("D://text1.txt"));
		while (in.hasNext())
			s += in.nextLine() + "\r\n";
		in.close();
		System.out.println(s);
		String[] words = s.split(" ");
		Set<String> wordsSet = new HashSet<String>(Arrays.asList(words));
		for (String word : wordsSet) {
			int count = 0;
			for (String w : words) {
				if (word.equals(w))
					count++;
			}
			System.out.println(word + " - " + count);
		}
	}
}

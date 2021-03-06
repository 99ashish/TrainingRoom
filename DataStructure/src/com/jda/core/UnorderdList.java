package com.jda.core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import com.jda.Utility.CustomLinkedList;
import com.jda.utility.AlgorithmUtility;
/**
 * Read from file the list of Words and take user input to search a Text.
 * The List of Words to a File.
 *
 */
public class UnorderdList 
{
	public static void main(String[] args)
	{
		try
		{
		CustomLinkedList list = new CustomLinkedList();
		System.out.println("Enter the exact path to read the file");
		String fileName = AlgorithmUtility.getString();
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] tmpstr;
		while ((st = br.readLine()) != null) {
			tmpstr = st.split(",");
			for (int i = 0; i < tmpstr.length; i++) {
				list.add(tmpstr[i]);
			}
		}
		System.out.println("Enter the string to search in the file content");
		String key=AlgorithmUtility.getString();
		int idx = list.search(key);
		if (idx == -1)
		{
			list.add(key);
		}
		else
		{
			list.pop(idx);
		}
	
	list.writeToFile(fileName);
	System.out.println("File " + fileName +"  updated successfully" );
	}
	catch(Exception e)
	{
	System.out.println(e+ " Exception");
	}
}
}

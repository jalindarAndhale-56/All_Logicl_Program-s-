package Logical_Programs;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class pro2 {

	public static void main(String[] args) throws FileNotFoundException
	{
		File f=new File("E:\\source.txt");
		Scanner s=new Scanner(f);
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		System.out.println(" ============================== ");
		FileReader f1=new FileReader("E:\\source.txt");
		Scanner s1=new Scanner(f1);
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
		
		System.out.println(" ============================== ");
		FileInputStream f2=new FileInputStream("E:\\source.txt");
		Scanner s2=new Scanner(f2);
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}
		
	}

}

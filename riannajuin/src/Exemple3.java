import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple3 {



	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		int c;
		
		ficALire=new FileReader("monFichier.txt");
		entree = new BufferedReader(ficALire);
		c=entree.read(); // Lecture du premier caractère
		
		while(c != -1 && c !='\n')
		{
			System.out.println((char) c);
			c=entree.read();
		}
		
		entree.close();
		ficALire.close();
	
	}
}
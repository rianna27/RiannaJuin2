/*
 * Author: Rianna Smuk
 * Date: Juin 17 2021
 */

package riannajuin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhone {

	public static void main(String[] args)
	{
		Scanner crayon=new Scanner (System.in);
		System.out.println("Inscrire le numéro de téléphone au format (123)-456-7890 Ext 234");
		String input= crayon.nextLine();
		verifPhone(input);
		crayon.close();
	}
	
	private static void verifPhone(String tel)
	{
		Pattern pattern= Pattern.compile("\\(\\d{3}\\)[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}\\s(X|Ext)\\s\\d{3,5}");
		Matcher matcher=pattern.matcher(tel);
		if(matcher.matches())
			System.out.println("le numéro" +tel+"est valide");
		else 
			System.out.println("le numéro" +tel+" n'est pas valide");
	}
}

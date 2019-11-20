/*
* File name: Sercurity.java
*
* Programmer:Jeremy Howard
* ULID: jlhowa3
*
* Date: Oct 13, 2019
*
* Class: IT 168
* Lecture Section: 16
* Lecture Instructor: Tonya Pierce
* Lab Section: 17
* Lab Instructor: Kushal Sharma
*/
package edu.ilstu;

/**
 * <Class that holds the methods called in the Security App>
 *
 * @author Jeremy Howard
 *
 */

public class Security
{

	/*
	 * Takes in a phrase and turns certain characters to special characters.Checks
	 * if a special character is used and if not, adds ! to the end. It also counts
	 * the number of characters in the string and put it in the generated password.
	 * Alternates the case of alphabetical letters.
	 */

	public static String generatePassword(String pass)
	{
//		char first = Character.toUpperCase(pass.charAt(0));
//		pass = first + pass.substring(1);

		String result = "";
		for (int i = 0; i < pass.length(); i++)
		{

			char one = pass.charAt(i);
			switch (Character.toUpperCase(one))
			{

			case 'S':
				one = '$';
				break;
			case 'A':
				one = '@';
				break;
			case 'O':
				one = '0';
				break;
			case 'E':
				one = '3';
				break;
			case ' ':
				one = '_';
				break;

			}

			result = result + one;

		}

		String generate = "";
		boolean lastLetterWasLowerCase = true;
		for (int i = 0; i < result.length(); i++)
		{

			char current = result.charAt(i);
			if (Character.isLetter(current))
			{
				if (lastLetterWasLowerCase)
				{
					current = Character.toUpperCase(current);
				}
				else
				{
					current = Character.toLowerCase(current);
				}
				lastLetterWasLowerCase = !lastLetterWasLowerCase;
			}

			generate = generate + current;

		}

		boolean symbol = false;
		for (int i = 0; i < generate.length(); i++)
		{

			char one = generate.charAt(i);
			switch (one)
			{

			case '$':

			case '@':

			case '#':

			case '%':

			case '*':

			case '&':

			case '!':

			case '^':

				symbol = true;
				break;

			}

			if (symbol)
				break;

		}

		if (symbol == false)
		{

			generate = generate + "!";
		}

		return generate + pass.length();

	}

	/*returns a caesar encrypted phrase given a phrase and offset.
	 */
	
	public static String caesarEncrypt(String phrase, int offset)
	{
		phrase = phrase.toUpperCase();

		String encrypt = "";
		for (int i = 0; i < phrase.length(); i++)
		{
			int first = (int) phrase.charAt(i);
			int shift = first + offset;
			int mod = (shift - 65) % 26;
			char convert = (char) (mod + 65);
			encrypt = encrypt + convert;
		}

		return encrypt;

	}


	/*returns a vigenere encrypted phrase given a phrase and key.
	 */
	public static String vigenereEncrypt(String phrase, String key)
	{
		String vigenere = "";
		if (key.length() <= phrase.length())
		{
			phrase = phrase.toUpperCase();
			key = key.toUpperCase();

			for (int i = 0; i < phrase.length(); i++)
			{

				int k = (int) key.charAt(i % key.length()); // stores the
															// character of
															// key(i modulo
															// length of key
															// wraps i back to a
															// character in key)

				vigenere += Security.caesarEncrypt("" + phrase.charAt(i), (k - 65));

			}
		}
		else
		{

			System.out.println("Key cannot be longer than the phrase");

		}

		return vigenere;

	}


	/*returns a decrypted phrase given a caesar phrase and offet.
	 */
	public static String caesarDecrypt(String phrase, int offset)
	{
		phrase = phrase.toUpperCase();

		String decrypt = "";
		for (int i = 0; i < phrase.length(); i++)
		{
			int first = (int) phrase.charAt(i);
			int shift = first - offset;
			int mod = (shift + 65) % 26;
			char convert = (char) (mod + 65);
			decrypt = decrypt + convert;
		}

		return decrypt;

	}

	/*returns a decrypted phrase given a vigener phrase and key.
	 */
	public static String vigenereDecrypt(String phrase, String key)
	{
		String vigenere = "";
		if (key.length() <= phrase.length())
		{
			phrase = phrase.toUpperCase();
			key = key.toUpperCase();

			for (int i = 0; i < phrase.length(); i++)
			{

				int k = (int) key.charAt(i % key.length()); // stores the
															// character of
															// key(i modulo
															// length of key
															// wraps i back to a
															// character in key)

				vigenere += Security.caesarDecrypt("" + phrase.charAt(i), (k - 65));

			}
		}
		else
		{

			System.out.println("Key cannot be longer than the phrase");

		}

		return vigenere;

	}

}

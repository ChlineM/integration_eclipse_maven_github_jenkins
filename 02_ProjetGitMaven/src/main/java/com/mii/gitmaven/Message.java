package com.mii.gitmaven;

import java.util.Random;

public class Message {
	
	private static String[] tbMessages =
		{
				"bonjour %%",
				"comment allez-vous %% ?",
				"�a va %% ?",
				"vous avez bonne mine, %% aujourd'hui"
		};
	
	//choisir un message de mani�re al�atoire et le personnaliser
	public String getMessage(String nom)
	{
		Random rnd = new Random();
		String msg= tbMessages[rnd.nextInt(tbMessages.length)];
		return msg.replaceAll("%%", nom);
	}

}

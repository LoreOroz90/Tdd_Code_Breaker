package co.edu.udea.appempresariales.example;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.StyledEditorKit.BoldAction;

public class CodeBreaker 
{
	String numero;
	
	public void setNumero(String num)
	{
		numero = num;		
	}
	
	public String comparar(String val)
	{
		if(validarNumero(val) == false) return "";
		
		if(numero.equals(val))return "XXXX";
		
		String result = "";
				
		for (int i = 0; i < 4; i++)
		{
			if(numero.charAt(i) == val.charAt(i))
			{
				result += "X";
			}
			else if(val.contains(String.valueOf(numero.charAt(i))))
			{
				result += "_";
			}
				
		}
		return result;
	}
	
	public boolean validarNumero(String val)
	{
		if(val.length() != 4 || val.length() == 0)
			return false;
		
		try
		{
			int num = Integer.parseInt(val);
			return true;
		}
		catch(NumberFormatException nufoex)
		{
			return false;
		}	
		
	}
	
	
	
	
}

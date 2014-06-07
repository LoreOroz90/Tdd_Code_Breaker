package co.edu.udea.appempresariales.example;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class Code_Breaker_Test 
{
	// Ensayo para saber como se realiza el commit en GitHub
	
	CodeBreaker code;
	
	@Before
	public void setUp() throws Exception
	{
		code = new CodeBreaker();
	}
		
	
	@Test
	public void prueba_de_todosXXXX()
	{
		code.setNumero("1234");
		String resultado = code.comparar("1234");
		Assert.assertEquals("XXXX", resultado);
	}
	
	@Test
	public void prueba_no_relacion()
	{
		code.setNumero("1234");
		String resultado = code.comparar("5678");
		Assert.assertEquals("", resultado);
	}	
	
	@Test
	public void prueba_todos____()
	{
		code.setNumero("1234");
		String resultado = code.comparar("4321");
		Assert.assertEquals("____", resultado);
	}
	
	@Test
	public void prueba_digitos_repetidos()
	{
		code.setNumero("1244");
		String resultado = code.comparar("1241");
		Assert.assertEquals("XXX_", resultado);
	}
	
	@Test
	public void prueba_todos_iguales()
	{
		code.setNumero("4444");
		String resultado = code.comparar("1241");
		Assert.assertEquals("__X_", resultado);
	}
	
	@Test
	public void prueba_longitud()
	{
		code.setNumero("1234");
		String resultado = code.comparar("12345");
		Assert.assertEquals("", resultado);
	}
	
	@Test
	public void prueba_vacio()
	{
		code.setNumero("1234");
		String resultado = code.comparar("");
		Assert.assertEquals("", resultado);
	}
	
	@Test
	public void prueba_letras()
	{
		code.setNumero("1234");
		String resultado = code.comparar("abcd");
		Assert.assertEquals("", resultado);
	}
	
	@Test
	public void prueba_iguales_repetidos()
	{
		code.setNumero("1111");
		String resultado = code.comparar("1111");
		Assert.assertEquals("XXXX", resultado);
	}
}

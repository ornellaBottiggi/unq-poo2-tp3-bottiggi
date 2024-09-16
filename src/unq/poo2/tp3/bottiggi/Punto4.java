package unq.poo2.tp3.bottiggi;

public class Punto4 {
	
	/*public Punto4(){*/
	String a = "abc" ;
	String s = a;
	String t;
	/*}*/
	
	/*RETORNA 3*/
	public int expresion1() {
		return s.length();
	}
	
	/* NO SE PUEDE INVOCAR "STRING.LENGTH() PORQUE T ES NULL"*/
	public int expresion2() {
		return t.length();
	}
	
	/*RETORNA "1abc"*/
	public String expresion3() {
	String b = 1 + a;
		return b;
	}
	
	/*RETORNA "ABC"*/
	public String expresion4() {
		return a.toUpperCase();
	}
	
	/*RETORNA 5*/
	public int expresion5() {
		return "Libertad".indexOf("r");
	}
	
	/*RETORNA 7*/
	public int expresion6() {
		return "Universidad".lastIndexOf('i');
	}
	
	/*RETORNA "il"*/
	public String expresion7() {
		return "Quilmes".substring(2,4);
	}
	
	/*RETORNA "false*/
	public boolean expresion8() {
		return (a.length() + a).startsWith("a");
	}
	
	/* INVALID ASSIGNMENT OPERATION
	public String expresion9() {
	s == a;
	}
	*/
	
	/*RETORNA true*/
	public boolean expresion10() {
		return a.substring(1,3).equals("bc");
	}
}

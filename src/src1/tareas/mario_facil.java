package src1.tareas;

import libs.Input;

public class mario_facil {
	
	public static void main(String args[])
	{
		System.out.print("Especifica la altura de la piramide: ");
	    int x = Input.get_int(); //numero del usuario
	    
	    for(int linea=1 ;linea <= x ; linea++)
	    {
	    	String piramide= "";
	    	for (int character=0; character <= x; character++)
	    	{
	    		int gato = x-linea;
	    		if(character >= gato || character == x)
	    			piramide += "#";
	    		else
	    			piramide += " ";
	    	}
	    	System.out.println(piramide);
	    }
	 
	}
}

//1 '    ##' si tengo 5 pero tengo que poner gato desde el 4> el numero del usuario menos la linea en la que estoy desde donde empiezo
//2 '   ###'
//3 '  ####'
//4 ' #####'
//5 '######'
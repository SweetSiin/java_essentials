package src1.tareas;

import libs.Input;

public class mario_dificil {

	public static void main(String args[])
	{
		System.out.print("Especifica la altura de la piramide: ");
	    int altura = Input.get_int(); //numero del usuario
	    
	    for(int linea=1 ;linea <= altura ; linea++)
	    {
	    	String piramide= "";
	    	for (int character=0; character <= altura; character++)
	    	{
	    		int gato = altura-linea;
	    		if(character > gato || character == altura)
	    			piramide += "#";
	    		else
	    			piramide += " ";
	    	}
	    	
	    	StringBuffer sb = new StringBuffer(piramide);
	    	sb.reverse();
	    	
	    	System.out.println(piramide + " " + sb );
	    }
	 
	}
}

package src1.tareas;

import libs.Input;

public class botellas_agua {		   
			
			public static void main(String args[])
			{
				// prompt user for x
				System.out.print("Cuantos minutos tardas en ba�arte?: ");
			    int x = Input.get_int();
			    
			    // prompt user for y
			    int y = 12;
			    
			    // calculate sum for user
			    System.out.println("Tu total de botellas de agua utilizados mientras te ba�as es de: " + (x * y));   
			}
}

package src1.tareas;

import libs.Input;

public class botellas_agua {		   
			
			public static void main(String args[])
			{
				// prompt user for x
				System.out.print("Minutos: ");
			    int minutos_ducha = Input.get_int();
			    int i = get_negative_int();
			   //AGREGAR UNA VALIDACION PARA NEGATIVOS*
			   //AGREGAR UNA FUNSION QUE FORCE A METER UN NUMERO POSITIVO**
			//    public static int get_negative_int()
				//{
				//    int n;
				//    do
				   // {
				   //     Input.print("n is "); // mostrar mensaje para introducir valor
				   //     n = Input.get_int();
				 //   }
			//	    while (n >= 0);
			//	    return n;
		//		}
			    
			    
			    // prompt user for y
			    int botellasPorMin = 12;
			    
			    System.out.println("Botellas: " + (minutos_ducha * botellasPorMin));   
			}

			private static int get_negative_int() {
				// TODO Auto-generated method stub
				return 0;
			}
}

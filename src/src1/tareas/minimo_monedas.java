package src1.tareas;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import libs.Input;

public class minimo_monedas {
	public static void main ( String[] args ) throws Exception
	{
		double amount = 0;
		double[] coin = {0.25f, 0.10f, 0.05f, 0.01f}; //monedas
		int num = 0;
		int coins=0;
		double currentCoin;
		
		DecimalFormat df = new DecimalFormat("#,###,###,##0.00"); //reducir a 2 decimales
		
		System.out.print("Hola! Cuanto cambio te debo?:\n ");
	    amount = Input.get_double(); //numero del usuario
	
		for(int i=0; i<coin.length; i++) {
			if(coin[i]<=amount) {
				num=(int)(amount/coin[i]); // conversión  de double a int
				coins+=num;
				currentCoin=(num * coin[i]);
				amount-=currentCoin;
				amount= new Double(df.format(amount)).doubleValue(); //redondear a 2 deciales
			}
		}
		System.out.println(coins);
	}
}




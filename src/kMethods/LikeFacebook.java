package kMethods;

public class LikeFacebook {

	//	Like en publicaciones de una persona en facebook

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		*navegarurl
		navegarUrl("http://facebook.com");
		//		*loguearse
		loguinCredenciales("dookie_revenge@hotmail.com", "pass1234");
		//		*navegar al perfil de la persona 
		navegarPerfil("Hector Daniel Aguirre Ochoa",true);
		//	
		//		-introducir el nombre de la persona en el buscador 
		//		-hacer click en la lupa
		//		-seleccinar el nombre de la persona 
		//		*una vez en el perfil hacer click en like de las 
		//		primeras "n" publicaciones
		likePublicaciones(5);

	}

	private static void navegarUrl(String url) {
		// TODO Auto-generated method stub

	}

	private static void loguinCredenciales(String correo, String pass) {
		// TODO Auto-generated method stub

	}

	private static void navegarPerfil(String nombrePersona,boolean esAmigo) {
		// TODO Auto-generated method stub
		buscarPersona(nombrePersona);
		ingresarPerfil(nombrePersona,esAmigo);
		
	}

	private static void ingresarPerfil(String nombrePersona, boolean esAmigo) {
		// TODO Auto-generated method stub
		
	}

	private static void buscarPersona(String nombrePersona) {
		// TODO Auto-generated method stub
		
	}

	private static void likePublicaciones(int numeroDePublicaciones) {
		// TODO Auto-generated method stub

	}

}

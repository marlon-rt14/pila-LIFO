package app;

public class MetodosEstudiante {

	Estudiante listaEstudiantes;
	int contadorID;

	public MetodosEstudiante() {
		this.listaEstudiantes = null;
		this.contadorID = 1;
	}

	private boolean estaVacia(Estudiante lista) {
		if (lista == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void agregar(String nombreEstudiante, String apellidoEstudiante, int edadEstudiante){
		Estudiante nuevo = new Estudiante(contadorID, nombreEstudiante, apellidoEstudiante, edadEstudiante);
		if (estaVacia(listaEstudiantes)) {
			listaEstudiantes = nuevo;
			contadorID++;
		}else {
			Estudiante listaActual = listaEstudiantes;
//			while(listaActual.getSiguienteEstudiante() != null){
//				listaActual = listaActual.getSiguienteEstudiante();
//			}
			nuevo.setSiguienteEstudiante(listaActual);
    			listaEstudiantes = nuevo ;
			contadorID++;
		}
	}
	
	public void actualizar(int idEstudiante, String nombreEstudiante, String apellidoEstudiante, int edadEstudiante){
		Estudiante listaActual = listaEstudiantes;
		while (!estaVacia(listaActual)) {
			if (listaActual.getIdEstudiante() == idEstudiante) {
				listaActual.setNombreEstudiante(nombreEstudiante);
				listaActual.setApellidoEstudiante(apellidoEstudiante);
				listaActual.setEdadEstudiante(edadEstudiante);
				break;
			}else{
				listaActual = listaActual.getSiguienteEstudiante();
			}
		}
	}
	
	public void eliminar(int idEstudiante){
		if (listaEstudiantes.getIdEstudiante() == idEstudiante) {
			listaEstudiantes = listaEstudiantes.getSiguienteEstudiante();
		}else{
			Estudiante listaActual = listaEstudiantes;
			while(!estaVacia(listaActual)){
				if (listaActual.getSiguienteEstudiante().getIdEstudiante() == idEstudiante) {
					Estudiante listaContinuacion = listaActual.getSiguienteEstudiante().getSiguienteEstudiante();
					listaActual.setSiguienteEstudiante(listaContinuacion);
					System.out.println("Estudiante eliminado!. \n");
					break;
				}else{
					listaActual = listaActual.getSiguienteEstudiante();
				}
			}
		}
	}
	
	
	public void imprimirLista(){
		Estudiante listaActual = listaEstudiantes;
		while(!estaVacia(listaActual)){
			System.out.println("ID: " + listaActual.getIdEstudiante());
			System.out.println("Nombre: " + listaActual.getNombreEstudiante());
			System.out.println("Apellido: " + listaActual.getApellidoEstudiante());
			System.out.println("Edad: " + listaActual.getEdadEstudiante());
			System.out.println("________________________________________\n");
			listaActual = listaActual.getSiguienteEstudiante();
		}
	}

}

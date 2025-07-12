package dataaccessobject;

import dataaccessobject.dao.EstudianteDAO;
import dataaccessobject.dao.EstudianteDAOImpl;
import dataaccessobject.model.Estudiante;

public class Main {
	 public static void main(String[] args) {
	        EstudianteDAO dao = new EstudianteDAOImpl();

	        for (Estudiante e : dao.getAllEstudiantes()) {
	            System.out.println(e);
	        }

	        dao.addEstudiante(new Estudiante(3, "Carlos"));
	        System.out.println(dao.getEstudiante(3));
	    }
}

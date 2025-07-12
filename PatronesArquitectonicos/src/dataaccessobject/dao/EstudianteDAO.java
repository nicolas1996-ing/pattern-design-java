package dataaccessobject.dao;

import java.util.List;

import dataaccessobject.model.Estudiante;

public interface EstudianteDAO {
    List<Estudiante> getAllEstudiantes();
    Estudiante getEstudiante(int id);
    void addEstudiante(Estudiante estudiante);
}

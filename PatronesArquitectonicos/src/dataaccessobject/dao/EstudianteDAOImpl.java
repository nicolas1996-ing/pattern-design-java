package dataaccessobject.dao;

import java.util.ArrayList;
import java.util.List;

import dataaccessobject.model.Estudiante;

public class EstudianteDAOImpl implements EstudianteDAO {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public EstudianteDAOImpl() {
        estudiantes.add(new Estudiante(1, "Ana"));
        estudiantes.add(new Estudiante(2, "Luis"));
    }

    @Override
    public List<Estudiante> getAllEstudiantes() {
        return estudiantes;
    }

    @Override
    public Estudiante getEstudiante(int id) {
        return estudiantes.stream().filter(e -> e.toString().contains("id=" + id)).findFirst().orElse(null);
    }

    @Override
    public void addEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}
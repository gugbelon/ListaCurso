package devandoid.belon.listacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandoid.belon.listacurso.model.Curso;

public class CursoController {

    public List listaCursos;

    public List getListaCurso(){

        listaCursos = new ArrayList <Curso>();

        listaCursos.add(new Curso());

        return listaCursos;
    }

}

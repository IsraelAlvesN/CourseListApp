package devandroid.maddo.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.maddo.applistacurso.model.Course;

public class CourseController {
    private List courseList;

    public List getListaDeCursos(){
        courseList = new ArrayList<Course>();

        courseList.add(new Course("Java"));
        courseList.add(new Course("C#"));
        courseList.add(new Course("Python"));
        courseList.add(new Course("Kotlin"));

        return courseList;
    }

    public ArrayList<String> dadosParaSpinner(){
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCursos().size(); i++) {
            Course objeto = (Course) getListaDeCursos().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
        }
        return  dados;
    }
}

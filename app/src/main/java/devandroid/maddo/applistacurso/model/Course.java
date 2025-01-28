package devandroid.maddo.applistacurso.model;

public class Course {
    private String nomeDoCursoDesejado;

    public Course(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }

    public String getNomeDoCursoDesejado() {
        return nomeDoCursoDesejado;
    }

    public void setNomeDoCursoDesejado(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }
}

package poo;

public class Curso {
    public static void main(String[] args) {
        
    }
    String curso, escola, metodo, periodo;
    int semestres;

    public Curso(String curso, String escola, String metodo, String periodo, int semestres) {
        this.curso = curso;
        this.escola = escola;
        this.metodo = metodo;
        this.periodo = periodo;
        this.semestres = semestres;
    }

    public void Visualizar(){
        System.out.println("Curso: " + this.curso);
        System.out.println("\n Faculdade: " + this.escola);
        System.out.println("\n Metodo: " + this.metodo);
        System.out.println("\n Periodo: " + this.periodo);
        System.out.println("\n Semestres: " + this.semestres);
    }  

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    
}

package Service;
import Entity.Curso;
import java.util.Scanner;
public class CursoService {
    Scanner read = new Scanner(System.in);
    public String[] cargarAlumnos() {
        String [] alumnos = new String[5];
        for (String alumno : alumnos) {
            System.out.println("Alumno: ");
            alumno = read.nextLine();
        }
        return alumnos;
    }
    public Curso crearCurso() {
        String nombreCurso = "Curso A";
        int cantidadHorasPorDia = 5;
        int cantidadDiasPorSemana = 25;
        String turno = "mañana";
        int precioPorHora = 5;
        String [] alumnos = cargarAlumnos(); 
        Curso curso = new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora, alumnos);
        return curso;
    }
    public void calcularGananciaSemanal(Curso curso) {
        int ganancia = curso.getCantidadHorasPorDia()*curso.getPrecioPorHora()*curso.getAlumnos().length*curso.getCantidadDiasPorSemana();
        System.out.println("Ganancia: " + ganancia);
    }
}

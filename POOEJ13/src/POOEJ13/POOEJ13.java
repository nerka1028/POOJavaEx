package POOEJ13;
import Service.CursoService;
import Entity.Curso;
public class POOEJ13 {
    public static void main(String[] args) throws Exception {
        CursoService cursoService = new CursoService();
        Curso curso = cursoService.crearCurso();
        cursoService.calcularGananciaSemanal(curso);
    }
}

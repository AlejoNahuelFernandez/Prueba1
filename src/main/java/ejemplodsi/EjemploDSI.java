
package ejemplodsi;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class EjemploDSI 
{
    public static void main(String[] args)
    {
        Profesor profesor1 = new Profesor();
        profesor1.nombre="José";
        profesor1.domicilio="Ayacucho 2950";
        profesor1.dni=34651323;
        profesor1.gradoAcademico="Postgrado";
        
        Materia materia1 = new Materia();
        materia1.nombre="Algoritmos";
        materia1.carrera="Ingeniería en Sistemas";
        
        Designacion designacion = new Designacion();
        designacion.profesor=profesor1;
        Date date = new Date();
        designacion.fechaIngreso= date;
        
        materia1.designaciones.add(designacion); 
        Iterator<Designacion> iterator = materia1.designaciones.iterator();
        if(iterator.hasNext())
        {
            System.out.println( iterator.next().profesor.nombre );
        }
        else
        {
             System.out.println("No hay asignado profesor!");
        }
    }
}

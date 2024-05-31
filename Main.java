import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Departamento departamento1 = new Departamento("Norte Santander");
        Municipio municipio1 = new Municipio("Cucuta", departamento1);

        Departamento departamento2 = new Departamento("Cundinamarca");
        Municipio municipio2 = new Municipio("Bogota", departamento2);

        
        List<Sismo> sismos = new ArrayList<>();
          Sismo sismo1 = new Sismo(new Date(2024-1900, 3-1, 5), 4.5, 40.0, municipio1, 30, true,53);        
         sismos.add(sismo1);
        Sismo sismo2 = new Sismo(new Date(2024-1900, 3-1, 25), 6.8, 200.0, municipio2, 60, false,0); 
          sismos.add(sismo2);
       
        Date fechaInicio = new Date(2024-1900, 3-1, 1); 
         Date fechaFin = new Date(2024-1900, 3-1, 30); 

        
        System.out.println("Fecha de inicio: " + fechaInicio);
         System.out.println("Fecha de fin: " + fechaFin);

        // Filtrar sismos dentro del rango de fechas
        List<Sismo> sismosEnRango = new ArrayList<>();
        for (Sismo sismo : sismos) {
            if (sismo.getFechaHora().after(fechaInicio) && sismo.getFechaHora().before(fechaFin)) {
                sismosEnRango.add(sismo);
            }
        }

        // Agregar declaración de impresión para depurar
        System.out.println("Cantidad de sismos dentro del rango: " + sismosEnRango.size());

        // Mostrar sismos dentro del rango de fechas
        System.out.println("Sismos dentro del rango de fechas:");
        System.out.println();
        if (sismosEnRango.isEmpty()) {
            System.out.println("No se encuentran Sismos en el Rango");
        } else {
            for (Sismo sismo : sismosEnRango) {
                System.out.println("Fecha y hora: " + sismo.getFechaHora());
                System.out.println("Magnitud: " + sismo.getMagnitud());
               System.out.println("Profundidad: " + sismo.getProfundidad() + " km");
                 System.out.println("Duración: " + sismo.getDuracion() + " segundos");
                System.out.println("Epicentro: " + sismo.getEpicentro().getNombre() + ", " + sismo.getEpicentro().getDepartamento().getNombre());
                System.out.println("Clasificación de magnitud: " + sismo.clasificarMagnitud());
                 System.out.println("Clasificación de profundidad: " + sismo.clasificarProfundidad());
                 System.out.println(sismo.RegistrarDaños(sismo.getvictimas()));
                  System.out.println();
            }
        }
    }
}
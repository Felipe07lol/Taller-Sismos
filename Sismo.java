import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Sismo {
    private Date fechaHora;
    private double magnitud;
    private double profundidad;
    private Municipio epicentro;
    private int duracion;
    
    private boolean daños;
    private int victimas;

    
   
    public Sismo(Date fechaHora, double magnitud, double profundidad, Municipio epicentro, int duracion, boolean daños, int victimas) {
        this.fechaHora = fechaHora;
        this.magnitud = magnitud;
        this.profundidad = profundidad;
        this.epicentro = epicentro;
        this.duracion = duracion;
        
        this.daños = daños;
        this.victimas = victimas;
    }

  
    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(double magnitud) {
        this.magnitud = magnitud;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public Municipio getEpicentro() {
        return epicentro;
    }

    public void setEpicentro(Municipio epicentro) {
        this.epicentro = epicentro;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
     public boolean getdaños() {
        return daños;
    }

    public void setdaños(boolean daños) {
        this.daños = daños;
    }
     public int getvictimas() {
        return victimas;
    }

    public void setvictimas(int victimas) {
        this.victimas = victimas;
    }

   
    public String clasificarMagnitud() {
        if (magnitud >= 2.0 && magnitud < 3.0) {
            return "Micro Magnitud";
         }  else if (magnitud >= 3.0 && magnitud < 4.0) {
            return "Menor Magnitud";
          }  else if (magnitud >= 4.0 && magnitud < 5.0) {
            return "Ligera Magnitud";
        }     else if (magnitud >= 5.0 && magnitud < 6.0) {
            return "Moderada Magnitud";
        }    else if (magnitud >= 6.0 && magnitud < 7.0) {
            return "Fuerte Magnitud";
        }     else if (magnitud >= 7.0 && magnitud < 8.0) {
            return "Mayor Magnitud";
        }      else if (magnitud >= 8.0 && magnitud < 10.0) {
            return "Gran Magnitud";
        }         else if (magnitud >= 10.0) {
            return "Magnitud Épica";
        } else {
            return "No clasificado";
        }
    }

 
   
    public String clasificarProfundidad() {
        if (profundidad <= 70.0) {
            return "Superficial";
        } else if (profundidad > 70.0 && profundidad <= 300.0) {
            return "Intermedio";
        } else {
            return "Profundo";
        }
    }
    
    public String RegistrarDaños(int victimas) {
        if(daños == true){
            return "Cucuta,Patios,Pamplona,Ocaña fueron los municipio afectados y su numero de victimas fue: " + victimas;
        }
        else{
            return "No se registraron daños ni victimas";
        }
    }
}

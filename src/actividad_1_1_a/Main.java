
package actividad_1_1_a;

import actividad_1_1_a.Clases.BoletinPublicado;
import actividad_1_1_a.Clases.RevistaPublicada;
import actividad_1_1_a.Interfaces.PantallaPrincipal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList <RevistaPublicada> nuevaRevistaPublicadas = new ArrayList<>();
        ArrayList <BoletinPublicado> nuevoBoletinesPublicados = new ArrayList<>();
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal(nuevaRevistaPublicadas, nuevoBoletinesPublicados);
        pantallaPrincipal.setVisible(true);
    }
    
}

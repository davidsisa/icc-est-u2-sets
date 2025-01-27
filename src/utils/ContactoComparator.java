package utils;

import java.util.Comparator;
import models.Contacto;
import org.w3c.dom.css.CSS2Properties;

public class ContactoComparator implements Comparator<Contacto> {
        @Override
        public int compare(Contacto o1, Contacto o2) {
            
            int comparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
            int comparacionNumero = o1.getTelefono().compareToIgnoreCase(o1.getTelefono());
            if (comparacionNumero != 0) {
                return comparacionNumero;
            }
            if(comparacionApellido != 0){
                return comparacionApellido;
            }
            return o1.getNombre().compareToIgnoreCase(o2.getApellido());
        }
}

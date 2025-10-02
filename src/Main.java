import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        List<Persona> lstPersona = new ArrayList<>();

        Persona c1 = new Cliente("Pedro", "Lopez", "101010", 26, "Cliente Auxiliar", "Aux1010");



        Persona e1 = new Empleado("Lorena", "Gil", "2020202", 35, "INDEFINIDO", 3200000);


        lstPersona.add(c1);
        lstPersona.add(e1);


        for(Persona p: lstPersona){
            System.out.println(p.mostrarInfo());
        }

    }
}
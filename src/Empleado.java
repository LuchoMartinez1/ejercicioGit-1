import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Empleado {
    public String nombre;


    public String mostrar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nombre= br.readLine();
        return "El nombre del empleado es "+nombre+".";
    }
}

package Ejercicio2_2;

import java.io.*;

public class FiltraLineas {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        try {
            String linea = null;
            while ((linea = br.readLine()) != null) {
                if (linea.length() > 20) {
                    bw.write(linea);
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al leer la entrada.");
        }
    }
}








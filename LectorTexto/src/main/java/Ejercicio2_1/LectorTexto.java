package Ejercicio2_1;

import java.io.*;

public class LectorTexto {

    public static void main(String[] args) {
        File lecturaArchivo = null;
        FileReader fr;
        BufferedReader br;
        OutputStreamWriter osw;
        BufferedWriter bw;

        try {
            lecturaArchivo = new File("C:/Users/Usuario1/IdeaProjects/LectorTexto/entrada.txt");
            fr = new FileReader(lecturaArchivo);
            br = new BufferedReader(fr);
            osw = new OutputStreamWriter(System.out);
            bw = new BufferedWriter(osw);
            String linea = null;

            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}




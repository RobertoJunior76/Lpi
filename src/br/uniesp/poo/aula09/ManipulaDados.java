package br.uniesp.poo.aula09;

import java.io.*;

public class ManipulaDados {

    public static void escreverDados() {

        FileOutputStream arq;
        try {
            arq = new FileOutputStream("dados.dat");
            for (int cont = 65; cont < 91; cont++) {
                arq.write(cont); //escreve byte (8bits) em arquivo
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void lerDados() {
        FileInputStream arq;
        int letra = 0;
        try {
            arq = new FileInputStream("dados.dat");
            while(letra != -1) {
                letra = arq.read();
                System.out.println(letra);
            }
            arq.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void lerDadosTexto() {

        FileReader in = null;
        try {
            in = new FileReader("testesaida.txt");
            int c;
            while ((c = in.read()) != -1)
                System.out.print((char) c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public  static void escreverDadosTexto() {
        FileWriter out = null;
        int contLetra = 0;
        String texto = "Texto para gravar no arquivo";
        try {
            out = new FileWriter("testesaida.txt");
            contLetra++;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}


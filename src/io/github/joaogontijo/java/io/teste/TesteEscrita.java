package io.github.joaogontijo.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("escrita.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Testando a escrita de arquivos");
        bw.newLine();
        bw.write("Testando uma nova linha");
        
        bw.close();
	}
}

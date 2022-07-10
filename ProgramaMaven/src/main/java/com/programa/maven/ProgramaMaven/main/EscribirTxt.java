package com.programa.maven.ProgramaMaven.main;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class EscribirTxt {

	public void escribir (List<String> proveedoresLista) {
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
			f = new File("Lista proveedores.txt");
			w =  new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			for (String proveedores : proveedoresLista) {
				wr.write(proveedores);
				wr.write("\n");
			}
			
			wr.close();
			bw.close();
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}

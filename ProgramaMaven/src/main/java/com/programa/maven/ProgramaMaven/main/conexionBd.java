package com.programa.maven.ProgramaMaven.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class conexionBd {

	public  void conexionBd(int numeroProveedor) {
		EscribirTxt escribir = new EscribirTxt();
		List<String> proveedoresLista = new ArrayList<String>();
		try {
			//Creo conexion
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_ejercicio", "root", "");
			
			//creo objeto
			Statement statement= conexion.createStatement();
			
			//Ejecuto la query
			ResultSet resulSet = statement.executeQuery("SELECT `id_proveedores`, `nombre`, `fecha_de_alta`, `id_cliente` FROM proveedores WHERE `id_cliente` = " + numeroProveedor);
			
			//recorrer
			while (resulSet.next()) {
				proveedoresLista.add(resulSet.getString("id_proveedores")+ " " + resulSet.getString("nombre") + " " + resulSet.getString("fecha_de_alta") + " " + resulSet.getString("id_cliente"));
			}
			
			if (proveedoresLista.isEmpty()) {
				System.out.println("No existen proveedores");
			}else {
				escribir.escribir(proveedoresLista);
			}
			
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}

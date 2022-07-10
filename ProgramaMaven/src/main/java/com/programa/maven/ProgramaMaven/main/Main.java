package com.programa.maven.ProgramaMaven.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entradaScanner = new Scanner (System.in);
		int entradaTeclado = 0;
		conexionBd conexion = new conexionBd();
		try {
			System.out.println("Introduce el proveedor seleccionado");
			entradaTeclado = entradaScanner.nextInt();
			
			conexion.conexionBd(entradaTeclado);
		}catch (Exception e) {
			System.out.println("Introduce un número");
			}
		

	}

}

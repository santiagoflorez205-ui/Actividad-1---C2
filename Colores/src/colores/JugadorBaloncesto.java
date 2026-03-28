/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colores;

/**
 *
 * @author aula12
 */
public class JugadorBaloncesto {
private String nombre;
private int numeroCamiseta;
private double altura;
private String posicion;
private int puntosAnotados;

public JugadorBaloncesto(String nombre, int numeroCamiseta, double altura, String posicion, int puntosAnotados) {
this.nombre = nombre;
this.numeroCamiseta = numeroCamiseta;
this.altura = altura;
this.posicion = posicion;
this.puntosAnotados = puntosAnotados;
}

public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
public int getNumeroCamiseta() { return numeroCamiseta; }
public double getAltura() { return altura; }
public String getPosicion() { return posicion; }
public int getPuntosAnotados() { return puntosAnotados; }

public void encestar() {
System.out.println(nombre + " ");
this.puntosAnotados += 2;
}

public void saltar() {
System.out.println(nombre + " ");
}

public void defender() {
System.out.println(nombre + "");
}

public void pedirTiempoFuera() {
System.out.println(nombre + " ");
}

public void driblear() {
System.out.println(nombre + " ");
}
}


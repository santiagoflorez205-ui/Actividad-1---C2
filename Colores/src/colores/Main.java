package colores;

public class Main {
    public static void main(String[] args) {

    
        Helado h = new Helado("Grande", "Chicle", "Chispas", 5000, "azul");
        JugadorBaloncesto j = new JugadorBaloncesto("Jordan",10, 1.85, "Base",0 );
        
     
        System.out.println("Helado: " + h.getSabor() + ", "+ h.getTamaño() + ", "+ h.getTopping() + ", "+ h.getPrecio() + ", "+ h.getColor());
      
      
        System.out.println("\nJugador:");
        System.out.println("Nombre: " + j.getNombre());
        System.out.println("Numero: " + j.getNumeroCamiseta());
        System.out.println("Altura: " + j.getAltura());
        System.out.println("Posicion: " + j.getPosicion());
       
    }
}
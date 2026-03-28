package colores;

public class Helado {
    private String sabor;
    private String tamaño;
    private String topping;
    private double precio;
    private String color;

    public Helado() {
    }
    
    
    public Helado(String sabor, String tamaño, String topping, double precio, String color) {
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.topping = topping;
        this.precio = precio;
        this.color = color;
    }

    
    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    public String getTamaño() { return tamaño; }
    public void setTamaño(String tamaño) { this.tamaño = tamaño; }

    public String getTopping() { return topping; }
    public void setTopping(String topping) { this.topping = topping; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    
    public void escogerSabor() {
        System.out.println("Escogiste sabor: " + sabor);
    }

    public void escogerTamaño() {
        System.out.println("Tamaño: " + tamaño);
    }

    public void agregarTopping() {
        System.out.println("Topping: " + topping);
    }

    public void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }

    public void mostrarColor() {
        System.out.println("Color: " + color);
    }
}
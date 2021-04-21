
package pojo;


public class Factura {

 private String Nombre , Code , Precio , Cantidad;

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
 

    public Factura() {
    }

    public Factura(String Nombre, String Code, String Precio, String Cantidad) {
        this.Nombre = Nombre;
        this.Code = Code;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }
  
   

    @Override
    public String toString() {
        return "Factura{" + "Code=" + Code + ", Nombre=" + Nombre + ", Cantidad=" + Cantidad + ", Precio=" + Precio + '}';
    }

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    

   

 
   
}

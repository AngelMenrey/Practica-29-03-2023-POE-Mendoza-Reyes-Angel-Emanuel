package práctica.pkg6;

public class Viaje {
    private int numero;
    private String pais;
    private String ciudad;
    private Viaje siguiente;
    private int numdias;

    public Viaje(){
     this.numero = -1;
     this.pais = "";
     this.ciudad = "";
     this.siguiente = null;
     this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Viaje getSiguiente() {
        return siguiente;
    }
    
     public int getNumDias() {
        return numdias;
    }
    //----------------------------------------------------------------
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setSiguiente(Viaje siguiente) {
        this.siguiente = siguiente;
    }
    
     public void setNumDias(int numdias) {
        this.numdias = numdias;
    }
    
    
    
    
    
}

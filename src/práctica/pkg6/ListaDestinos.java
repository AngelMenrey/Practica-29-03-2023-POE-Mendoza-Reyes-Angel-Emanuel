package práctica.pkg6;

public class ListaDestinos {
    private Viaje destinos;
    
    public ListaDestinos(){
        destinos = null;
    }
    
    public void agregar(int n, String p, String c, int nd){
        Viaje nuevo = new Viaje();
        nuevo.setNumero(n);
        nuevo.setPais(p);
        nuevo.setCiudad(c);
        nuevo.setNumDias(nd);
        
        if(destinos == null){
            destinos = nuevo;
        }else{
        Viaje aux = destinos;
        while (aux.getSiguiente()!=null){
            aux= aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        }
    }
    
    public String recorrerDestinos(){
        String datos = "";
        Viaje aux = destinos;
        if(destinos== null){
            datos = "La lista está vacía";
        }else{
            while(aux!= null){
                datos += "Número: " + aux.getNumero() + "\n";
                datos += "Viaje: " + aux.getPais() + "\n";
                datos +=  aux.getCiudad() + "\n";
                datos += "Viaje: " + aux.getNumDias() + "\n";
                aux= aux.getSiguiente();            
            }
        
        }
        return datos;
    }
    
    public boolean estaVacia(){
        if(destinos == null){
            return true;
        }else{
            return false;
        }
    }
}

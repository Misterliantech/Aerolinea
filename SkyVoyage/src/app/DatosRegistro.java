
package app;


public class DatosRegistro {
    
    String origen;
    String destino;
    
    public void Tomar (String origen, String destino){
        
        this.origen = origen;
        this.destino = destino; 
    }
    
    public String origen(){
        
        return origen;
    }
    
    public String destino(){
        
        return destino;
    }
    
}

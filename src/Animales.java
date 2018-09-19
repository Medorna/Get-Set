public class Animales {
    
    private String raza;
    private String nombre;
    private String tipo;
    private boolean agresivo;
    private int edad;
    
    //metodos set
    public void setagresivo(boolean esagresivo){
    
        agresivo = esagresivo;
        
    }
    
    public void setedad(int edadrecibida){
    
        edad = edadrecibida;
   
    }
    
    public void setnombre(String nombrerecibido){
    
        nombre = nombrerecibido;
        
    }
    
    public void settipo(String tiporecibido){
    
        tipo = tiporecibido;
        
    }
    
    //----------------------------------------------------------
    //metodos get (recordar poner tipo de dato int, string ,etc)
    public boolean getagresivo(){
        
        return agresivo;
    
    }
    
    public int getedad(){
    
        return edad;
        
    }
    
    public String getnombre(){
    
        return nombre;
        
    }
    
    public String gettipo(){
    
        return tipo;
        
    }
    
}

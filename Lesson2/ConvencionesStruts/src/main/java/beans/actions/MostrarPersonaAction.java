package beans.actions;

import com.opensymphony.xwork2.ActionSupport;

public class MostrarPersonaAction extends ActionSupport{
    
    
    private String nombre;
    private String saludoPersonalizado;
    private static final String saludo = "Hola";
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String execute(){
           
        this.saludoPersonalizado = saludo + nombre;
        
        return SUCCESS;
    } 
    
    
   
}

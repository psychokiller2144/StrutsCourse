package beans;

public class PruebaStruts {
    
    private String message;
    
    public String execute(){
        
        //this.message = "Saludos desde Struts!!";
        this.setMessage("Saludos desde Struts!!");
        return "success";
    } 
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
}

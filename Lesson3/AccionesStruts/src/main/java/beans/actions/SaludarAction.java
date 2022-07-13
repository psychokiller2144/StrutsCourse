package beans.actions;

public class SaludarAction {
    
    private String message;
    
    public String execute(){
        
        //this.message = "Saludos desde Struts!!";
        this.setMessage("Conventions from struts!!");
        return "success";
    } 
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
}

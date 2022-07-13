package beans.actions;


import org.apache.logging.log4j.*;

public class GreetAction {
    
    Logger log = LogManager.getLogger(GreetAction.class);
    
    private String message; 

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String execute(){
        log.info("executing 'execute' method from struts2");
        this.setMessage("greetings from struts2, using conventions !!!");
        return "success";
    }
    
}

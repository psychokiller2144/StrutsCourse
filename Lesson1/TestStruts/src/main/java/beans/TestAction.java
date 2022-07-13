package beans;


import org.apache.logging.log4j.*;

public class TestAction {
    
    Logger log = LogManager.getLogger(TestAction.class);
    
    private String message; 

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String execute(){
        log.info("executing 'execute' method from struts2");
        this.setMessage("greetings from struts2");
        return "success";
    }
    
}

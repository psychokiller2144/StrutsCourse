package beans.actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class NameCollectorAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(NameCollectorAction.class);
    
    private static final String GREETING = "Hola ";
    private String name; 
    private String customGreeting;
    
    @Override
    public String execute(){
        log.info("The name is: " + name);
        setCustomGreeting(GREETING + name);
        return SUCCESS;
    }
    
    public String getCustomGreeting() {
        return customGreeting;
    }

    public void setCustomGreeting(String customGreeting) {
        this.customGreeting = customGreeting;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

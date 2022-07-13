package beans.actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class NameCollectorAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(NameCollectorAction.class);
    
    private static final String GREETING = "Hola ";
    private String name; 
    private String customGreeting;
    
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
    
    public String getTitle(){
        return getText("collector.title");
    }
    
    public String getHeading(){
        return getText("collector.heading");
    }
    
    public String getValue(){
        return getText("collector.value");
    }
    
    public String getButton(){
        return getText("collector.button");
    }
    
}

package beans.actions;

import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name="success", location="/WEB-INF/content/welcome.jsp"),
    @Result(name="input", location="/WEB-INF/content/login.jsp")
       
})
public class ValidateUserAction extends ActionSupport {
    Logger log = LogManager.getLogger(LoginAction.class);
    
    private String usuario;
    private String password;
    
    @Action("ValidateUser")
    public String execute(){
        if("admin".equals(this.usuario)){
            addActionMessage(getText("valid.user"));
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
    
    @Override
    public void validate(){
        
        if(this.usuario == null | "".equals(this.usuario.trim())){
            addFieldError("usuario",getText("val.user"));
        }else if(!validUser()){
            addActionError(getText("invalid.user"));
        }
        
        if(this.password == null | "".equals(this.password.trim())){
            
            addFieldError("password",getText("val.password"));
        
        }else if( this.password.length() < 3 ){
        
            addFieldError("password",getText("val.pass.min.len"));
        }
    }
    
    private boolean validUser(){
        return "admin".equals(this.usuario);
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

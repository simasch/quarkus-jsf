package ch.martinelli.demo.jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@RequestScoped
@Named
public class HelloBean {

    private String name;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        var message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Greeting", "Hello, " + name);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

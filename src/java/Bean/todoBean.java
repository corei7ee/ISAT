/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author KotaSuwazono
 */
@Named(value = "todoBean")
@Dependent
public class todoBean {

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    String label;
    String term;
    String detail;
    String priority;
    

    /**
     * Creates a new instance of todoBean
     */
    public todoBean() {
    }
    
}

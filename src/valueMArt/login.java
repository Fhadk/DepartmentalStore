/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package valueMArt;

import java.io.Serializable;

/**
 *
 * @author Fhad khan
 */
public class login implements Serializable {

    public login() {
    }

    public login(String name, String pass, String EType) {
        this.name = name;
        this.pass = pass;
        this.EType = EType;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setPass(String pass){
        this.pass=pass;
    }
    
    public void setEType(String Etype){
        this.EType=Etype;
    }
    
    public String getName(){
        return name;
    }
    public String getPass(){
        return pass;
    }
    public String getEType(){
        return EType;
    }        
    private String name;
    private String pass;
    private String EType;
}

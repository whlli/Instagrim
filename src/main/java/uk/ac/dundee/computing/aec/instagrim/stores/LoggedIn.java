/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.dundee.computing.aec.instagrim.stores;

/**
 *
 * @author Administrator
 */
public class LoggedIn {
    boolean logedin=false;
    String Username=null;
    String fname=null;
    String lname=null;
    String email=null;
    boolean haveUserPic=false;
    public void LogedIn(){
        
    }
    public void setFirstname(String name){
        this.fname=name;
    }
    public void setLastname(String name){
        this.lname=name;
    }
    public void setEmail(String name){
        this.email=name;
    }
    public void setUsername(String name){
        this.Username=name;
    }
    public void sethaveUserPic(boolean flag){
        this.haveUserPic=flag;
    }
    public boolean gethaveUserPic(){
        return haveUserPic;
    }
    public String getUsername(){
        return Username;
    }
    public String getFirstname(){
        return fname;
    }
    public String getLastname(){
        return lname;
    }
    public String getEmail(){
        return email;
    }
    public void setLogedin(){
        logedin=true;
    }
    public void setLogedout(){
        logedin=false;
    }
    
    public void setLoginState(boolean logedin){
        this.logedin=logedin;
    }
    public boolean getlogedin(){
        return logedin;
    }
}

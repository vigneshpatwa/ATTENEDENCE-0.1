/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stmodel;

/**
 *
 * @author HP
 */
public class User {
    private String name , id , sessionid ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }


    public User(String name,String id,String sessionid) {
        this.name = name;
        this.id = id;
        this.sessionid = sessionid;
        
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", id=" + id + ", sessionid=" + sessionid + '}';
    }



 



  
    
}

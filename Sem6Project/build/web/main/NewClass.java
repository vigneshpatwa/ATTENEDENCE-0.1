/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import stdaoimp.Userimp;
import stmodel.User;
import tedaoimp.tuserdaoimp;
import temodel.tuser;

/**
 *
 * @author HP
 */
public class NewClass {
    public static void main(String[] args) {
//        String id ="HT1"; 
//        Userimp ui = new Userimp();
//        User u = ui.getUserbyId(id);
//        System.out.println(u);   
//    boolean b = ui.addUser(u);
//    if(b){
//        System.out.println("sucess");
//       
//    }
//    else{
//        System.out.println("failed");
//    }
        
//        Userimp ui = new Userimp();
//        List<User> uu = ui.getAllluser();        
//        for (User u: uu) {
//           System.out.println(u);       }
//        User u = ui.getUserbyId("S2");
//          
//        u.setName("Siddhesh");
//        u.setSessionid("HT1");
//        
//        boolean b = ui.updateUser(u);
//        if (b) {
//            System.out.println("suc");
//        } else {
//            System.out.println("rej");
//        }
//        boolean b = ui.deleteUser(u);
//        if (b) {
//            System.out.println("suceess");
//        } else {
//            System.out.println("fail");
//        }
        String id="HTM1";
        tuserdaoimp ti = new tuserdaoimp();
        tuser t = ti.getTeacherbyid(id);
        System.out.println(t);
    }
}

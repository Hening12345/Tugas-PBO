/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notifikasi;

/**
 *
 * @author DELL
 */
public class PushNotif implements InterfaceNotif{
    
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim Push Notif ke " + receiver + " dengan isi : ");
        System.out.println(content);
    }
}

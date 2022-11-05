/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coupling;

/**
 *
 * @author Irv-PC
 */
public class Browser {

    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    public String findIpAddress(String address) {
        return "127.0.0.1";
    }

    public String sendHttpRequest(String ip) {
        return "<html></html>";
    }

}

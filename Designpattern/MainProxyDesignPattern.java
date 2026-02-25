/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydesignpattern;


public class MainProxyDesignPattern {

    
    public static void main(String[] args) 
    {
        Internet internet=new Proxy();
        internet.connectto("instagram");
        
    }
    
}

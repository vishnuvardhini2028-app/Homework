/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydesignpattern;

import java.util.ArrayList;


public class Proxy implements Internet
{
    ArrayList<String> ar=new ArrayList<String>();

    public Proxy() 
    {
        ar.add("amazon.com");
        ar.add("netflix.com");
        ar.add("Google.com");
        ar.add("Hotstar.com");
        ar.add("Facebook.com");
    }
    

    @Override
    public void connectto(String hostname) 
    {
       if(ar.contains(hostname))
       {
           System.out.println("access denied");
       }
       else
       {
           RealInternet ri=new RealInternet();
           ri.connectto(hostname);
       }
    }
    
}

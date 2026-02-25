/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydesignpattern;


public class RealInternet implements Internet 
{

    @Override
    public void connectto(String hostname) 
    {
        System.out.println("connecting to : " +hostname);
    }
    
}

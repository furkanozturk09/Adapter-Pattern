/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;


public class CharPrinter implements Printer{

    @Override
    public void print(char c)
    {
        System.out.println(c);
    }

    @Override
    public void print(char[] buffer) { }
    
}

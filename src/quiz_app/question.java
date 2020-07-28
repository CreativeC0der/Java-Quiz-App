/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_app;

import java.io.*;

/**
 *
 * @author Master Shrijon
 */
public class question 
{
    String q,op1,op2,op3,op4,ans,choice="";
    question prev;
    question nxt;
    question temp;
    question(question prev,BufferedReader br)throws IOException
    {
        nxt=this;
        String s=br.readLine();
        if(s==null)
        {
            prev.nxt=null;
            return;
        }
        ans=s.substring(0,s.indexOf('#'));
        q=s.substring(s.indexOf('#')+1);
        op1=br.readLine();
        op2=br.readLine();
        op3=br.readLine();
        op4=br.readLine();
        this.prev=prev;
        this.temp=new question(this, br);
        if(nxt!=null)
            nxt=this.temp;
    }
    
    
    
}

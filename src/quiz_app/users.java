/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_app;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Master Shrijon
 */
public class users
{

    String username, pass;
    JFrame frm;
    users(String username, String pass,JFrame frm)
    {
        this.username = username;
        this.pass = pass;
        this.frm=frm;
    }

    boolean signup()
    {
        if(username.equals("") || pass.equals(""))
            return false;
        try
        {
            FileWriter fw = new FileWriter("user_details.txt", true);
            fw.write(username + "\n");
            fw.write(pass + "\n");
            fw.close();
            return true;
        } catch (Exception e)
        {
            return false;
        }
    }

    boolean login()
    {
        if(username.equals("admin") && pass.equals("admin"))
        {
            new admin_dialog(frm, true);
        }
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("user_details.txt"));
            while (true)
            {
                if (br.readLine().equals(username) && br.readLine().equals(pass))
                {
                    return true;
                } 
            }
        } catch (Exception e)
        {
            return false;
        }
    }
}

package com.example;

import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        JSONObject jo = new JSONObject("{ \"name\" : \"Steve\" }");
        System.out.println(jo.toString());

        JOptionPane.showMessageDialog(null, "Mundo", "Olá", 0);
    }
}

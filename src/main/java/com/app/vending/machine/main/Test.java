package com.app.vending.machine.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;



public class Test {


    public static void main(String args[]) throws Exception {
        Properties p = new Properties();
        p.load(Test.class.getClassLoader().getResourceAsStream("ColdDrinkwallet.properties"));
        Enumeration e = p.propertyNames();

        for (; e.hasMoreElements();) {
            System.out.println(e.nextElement());

        }
    }

    /*public static void main(String[] args) {
        System.out.println("Hello");

        System.out.println(getFilePathToSave());
    }*/

    public static String getFilePathToSave() {

        Properties prop = new Properties();
        String filePath = "";

        try {

            InputStream inputStream =
                    Test.class.getClassLoader().getResourceAsStream("ColdDrinkwallet.properties");

            prop.load(inputStream);
            filePath = prop.getProperty("100");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return filePath;

    }
}

package com.app.vending.machine.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

public class T1 {

    public static void main(String[] args) throws Exception {

        m2();

    }

    public static void m1() throws Exception {
        Properties p = new Properties();
        p.load(Test.class.getClassLoader().getResourceAsStream("ColdDrinkItems.properties"));
        Enumeration e = p.propertyNames();

        for (; e.hasMoreElements(); ) {

            String key = (String) e.nextElement();
            System.out.println(key + "--" + p.get(key));

        }
    }

    public static  void m2() throws Exception
    {
        Properties p = new Properties();
        p.load(Test.class.getClassLoader().getResourceAsStream("ColdDrinkItems.properties"));
        Enumeration e = p.propertyNames();

        for (; e.hasMoreElements(); ) {

            String key = (String) e.nextElement();
           // System.out.println(key);

            if(key.contains("6"))
            {
                System.out.println(p.get(key).toString().substring(0,p.get(key).toString().lastIndexOf(",")));// diaplay price
                break;
            }

           //System.out.println(key.substring(key.indexOf(".")+1)); // item name
           //System.out.println(key.substring(0,key.lastIndexOf("."))); // item id

           // System.out.println(p.get(key).toString().substring(0,p.get(key).toString().lastIndexOf(",")));// diaplay price

            //System.out.println("ITEM -"+key.substring(0,key.lastIndexOf("."))+"-"+key.substring(key.indexOf(".")+1)+" PRICE -"+p.get(key).toString().substring(0,p.get(key).toString().lastIndexOf(",")));

           // System.out.println();

        }

        System.out.println("came out");

    }



    public void m3() throws Exception {

        Properties p = new Properties();
        p.load(Test.class.getClassLoader().getResourceAsStream("ColdDrinkItems.properties"));


        System.out.println(p.get("1.COCACOLA").toString().lastIndexOf(","));


    }
}
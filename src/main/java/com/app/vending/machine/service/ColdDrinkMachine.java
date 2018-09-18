package com.app.vending.machine.service;

import java.util.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Properties;

import com.app.vending.machine.exception.*;
import com.app.vending.machine.constants.*;
import java.io.InputStream;

public class ColdDrinkMachine extends VendingMachineInterface {

    //HOME PAGE OF COLD DRINK VENDING MACHINE
    public static MainDisplayInterface md = () -> {
        System.out.println("#####################COLD DRINK VENDING MACHINE#####################");
        System.out.println("1.LIST COOL BREVERAGES");
        System.out.println("2.ADMIN");
        System.out.println("ENTER CHOICE-");
        Scanner in = new Scanner(System.in);
        return in.nextInt();

    };

    //DISPLAYS ITEMS OF VENDING MACHINE FOLLOWED BY USER SELECT
    public static VendingMachineItems vmi = () -> {

        Properties p = new Properties();
        try {
            p.load(ColdDrinkMachine.class.getClassLoader().getResourceAsStream("ColdDrinkItems.properties"));
        }
        catch(Exception e){e.printStackTrace();}
        Enumeration e = p.propertyNames();

        for (; e.hasMoreElements(); ) {

            String key = (String) e.nextElement();
            System.out.println("ITEM -"+key.substring(0,key.lastIndexOf("."))+"-"+key.substring(key.indexOf(".")+1)+" PRICE -"+p.get(key).toString().substring(0,p.get(key).toString().lastIndexOf(",")));
            System.out.println();

        }

        System.out.println("MAIN-MENU PRESS- 0");
        System.out.println("ENTER ITEM ID TO PURCHASE-");
        Scanner in = new Scanner(System.in);

        //Integer itemPrice =

        return null;
    };

    //ITEM PURCHASE
    public static purchaseItem pi = (itemId , currencyNotes) -> {


        return null;
    };

    //MAINTAINENCE MODE FOR ADMIN
    public static maintainanceInterface mi = () -> {

        System.out.println("#####################VENDING MACHINE MAINTAINANCE MODE#####################");
        System.out.println("1.ADD ITEMS");
        System.out.println("2.REMOVE ITEMS");
        System.out.println("3.ADD CASH TO WALLET");
        System.out.println("4.WITHDRAW CASH FROM WALLET");
        System.out.println("MAIN-MENU PRESS- 0");
        System.out.println("ENTER CHOICE-");
        Scanner in = new Scanner(System.in);
        return in.nextInt();

    };

    //ADMIN AUTHENTICATION
    public static authenticateAdmin aa = (username, password) -> {

        if (username.equals(Admin.getUsername()) & password.equals(Admin.getPassword())) {
            return true;
        } else {
            return false;
        }

    };
}

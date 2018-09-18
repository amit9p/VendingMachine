package com.app.vending.machine.service;
import java.util.*;

public class IceCreamMachine extends VendingMachineInterface{


    public static MainDisplayInterface md = () -> {
        System.out.println("#####################ICE CREAM VENDING MACHINE#####################");
        System.out.println("1.LIST ALL ICECREAMS");
        System.out.println("2.ADMIN");
        Scanner in = new Scanner(System.in);
        return in.nextInt();

    };
}

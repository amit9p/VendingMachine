package com.app.vending.machine.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class VendingMachineInterface {

    //General Interfaces

    public interface VendingMachineItems {

        public Map<Integer , List<Integer>> SelectDisplayItems();
    }

    public interface MainDisplayInterface {
        public Integer mainDisplay();
    }

    public interface purchaseItem {
        public Integer purchaseItemAndReturnChange(Integer itemId, List<Integer> currencyNote);
    }








  //Interfaces for Admin

    public interface authenticateAdmin {
        public boolean authenticateAdmin(String username, String password);
    }

    public interface maintainanceInterface {
        public Integer maintainanceDisplay();
    }

    public interface addItems {
        public void addItemsInMachine(InputStream itemProperties);
    }

    public interface removeItems {
        public void removeItemsFromMachine(InputStream itemProperties);
    }

    public interface addCash {
        public void addCashToWallet(InputStream walletProperties);
    }

    public interface withDrawCash {
        public void withDrawCashFromWallet(InputStream walletProperties);
    }
}

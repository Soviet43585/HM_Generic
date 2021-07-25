package com.company;

public class TransactionUtil {

    public static <T extends BaseWallet<Double>> void executeTransaction(T from, T to, double amount) {

        from.setAmount(from.getAmount()-amount);
        to.setAmount(to.getAmount()+amount);

    }

}

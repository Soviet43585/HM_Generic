package com.company;

public class TransactionUtil {

    public static <T extends BaseWallet<Double>> void executeTransaction(T from, T to, double amount) throws NotEnoughMoneyException{
            if (from.getAmount() < amount) {
                throw new NotEnoughMoneyException("Недостаточно средств");
            }
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);

        System.out.println("Тразакцитя удалась\n");
    }

}

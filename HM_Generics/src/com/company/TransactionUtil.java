package com.company;

public class TransactionUtil {

    public static <T extends BaseWallet<Double>> void executeTransaction(T from, T to, double amount) throws NotEnoughMoneyException{
            if (from.getAmount() < amount) {
                throw new NotEnoughMoneyException("Недостаточно средств"); //хватает ли средств
            }
            from.setAmount(from.getAmount() - amount);  //отнимаем от одного счёта
            to.setAmount(to.getAmount() + amount);  //добавляем к другому счёту

        System.out.println("Тразакцитя удалась\n");
    }

}

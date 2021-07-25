package com.company;

public class Main {

    public static void main(String[] args){
	    GoldWallet gold = new GoldWallet(150.00);
	    PlatinumWallet platinum = new PlatinumWallet(200.00);
	    try {
			TransactionUtil.executeTransaction(gold, platinum, 200);
		}
	    catch(NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
    }
}

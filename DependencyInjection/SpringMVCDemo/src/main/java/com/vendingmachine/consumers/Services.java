

package com.vendingmachine.consumers;


public interface Services {

	void setQuantity(int quantity);

	double getTotalAmount();

	boolean collectCoins(double amount);

	void printBill();

}

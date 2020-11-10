package com.vendingmachine;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vendingmachine.consumers.ServiceConsumer;
import com.vendingmachine.consumers.Services;

public class FrontClass {

	public static Scanner scan = new Scanner(System.in);

	static Services vendingService;

	static ApplicationContext context = new AnnotationConfigApplicationContext(IocContainer.class);

	public static void main(String[] args) {

		selectDrink();

	}

	public static void vendingMachine() {

		try {

			System.out.println("\n" + "You selected " + "\n" + vendingService);

			System.out.println("\n" + "Please select quantity :");

			vendingService.setQuantity(scan.nextInt());

			System.out.println("\n" + "Total amount to be paid :" + vendingService.getTotalAmount() + "\n"
					+ "Please insert coins ");

			while (vendingService.collectCoins(scan.nextDouble())) {

				System.out.println("Coin added");

			}

			System.out.println("\n" + "Please collect your Drink and Bill");

			vendingService.printBill();

		} catch (Exception e) {

			selectDrink();

		}

	}

	public static void selectDrink() {

		System.out.println("Enter your choice :" + "\n" + "1. COKE" + "\n" + "2. PEPSI" + "\n" + "3. SODA");

		int choice = scan.nextInt();

		if (choice == 1) {

			vendingService = (ServiceConsumer) context.getBean("coke");

		} else if (choice == 2) {

			vendingService = (ServiceConsumer) context.getBean("pepsi");

		} else if (choice == 3) {

			vendingService = (ServiceConsumer) context.getBean("soda");

		} else {

			System.out.println("Invalid Choice !");
		}

		vendingMachine();

	}

}

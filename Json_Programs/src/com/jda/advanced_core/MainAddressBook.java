package com.jda.advanced_core;

import com.jda.advanced_utility.Person;
import com.jda.advanced_utility.AddressBook;
import com.jda.advanced_utility.Input;

public class MainAddressBook {
	
	private static AddressBook addressBook = null;
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("1. New ....");
			System.out.println("2. Open....");
			System.out.println("3. Close ...");
			System.out.println("4. Save....");
			System.out.println("5. Save as.....");
			int opt = Input.getInteger();
			Input.getString();

			switch (opt) {
			case 1:
				System.out.println("Enter the name of the Address Book");
				String nameOfAddressBook = Input.getString();
				addressBook = new AddressBook(nameOfAddressBook);
				addressBook.createFile();
				break;
			case 2:
				AddressBook.showTotalJsonFile();
				System.out.println("Enter the name of the Existing Address Book");
				String nameOfOpeningAddressBook = Input.getString();
				addressBook = new AddressBook(nameOfOpeningAddressBook);
				addressBook.openFunction(addressBook);
			case 3:
				// addressBook.save();
				// addressBook.closeAddressBook();
				break;
			case 4:
				addressBook.save();
				break;
			case 5:
				// addressBook.saveAs();
			}
		}
	}

}
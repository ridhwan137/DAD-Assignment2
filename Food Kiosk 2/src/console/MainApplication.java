package console;

import java.util.ArrayList;

import gui.Client;
import kioskapp.OrderedItem;

public class MainApplication {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Object Create
		Client client = new Client();
		
		client.StartMenu();
		client.pause();
		
		System.out.println("Selection = " + client.getSelection());
		
		ArrayList<OrderedItem> unknown = client.unknown();
		for(OrderedItem orderedItem : unknown) {
			System.out.println("Name: " + orderedItem.getItemProduct().getName());
		}
	}
}

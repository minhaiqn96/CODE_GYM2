package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerList<E> {
	private List<E> elementCustomer;

	public void deleteElementInLibrary( int numberInArray){
		elementCustomer.remove(numberInArray-1);
		printElementInLibrary();
	}
	
	public void addElementInLibrary(E nameObject){
		if (elementCustomer == null) {
			elementCustomer = new ArrayList<E>();
		}
		elementCustomer.add(nameObject);
		System.out.println("Add successed a book. It name is "+nameObject.toString());
	}
	
	public void printElementInLibrary() {
		if (elementCustomer != null && !elementCustomer.isEmpty()) {
			for (int i = 0; i < elementCustomer.size(); i++) {
				System.out.println((i+1) + ":\t "+elementCustomer.get(i).toString());
			}
		}
	}
	
	
	public List<E> getElementInLibrary() {
		if (elementCustomer == null) {
			elementCustomer = new ArrayList<E>();
		}
		return elementCustomer;
	}
	public void setElementInLibrary(List<E> elementInLibrary) {
		this.elementCustomer = elementInLibrary;
	}
	
}

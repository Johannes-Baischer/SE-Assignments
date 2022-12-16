package mvc;

import mvc.presentation.MainFX;

public class Main {

  public static void main(String[] args) throws InterruptedException {
	Thread t = new Thread() {
		public void run() {
			MainFX.launch(MainFX.class, args);
		}
	};
	t.start();
	
	Thread.sleep(3000);
	
	   
	//making model changes
	
	//TODO: add a book to the model
	//observe the changes in the gui
	System.out.println(".");
	
	Thread.sleep(500);
	
	//TODO: add another book
	//observe the changes in the gui
	System.out.println(".");
	
	Thread.sleep(500);
	
	//TODO: edit a book
	//observe the changes in the gui
	System.out.println(".");
	
	Thread.sleep(500);
	
	//TODO: remove a book
	//observe the changes in the gui
	System.out.println(".");
	
	
  }
}

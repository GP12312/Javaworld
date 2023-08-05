package PsU.CommandD;

public class Client {

	public static void main(String[] args) {
				
		Document d1 = new Document();
		ActionListenerCommand c1 = new ActionOpen(d1);
		ActionListenerCommand c2 = new ActionSave(d1);
		
		MenuOptions menu = new MenuOptions(c1,c2);
		
		menu.clickOpen();
		menu.clickSave();
				
	}
		 

}

package PsU.CommandD;

public class MenuOptions {
	
	Document d;
	ActionListenerCommand aco = new ActionOpen(d);
	ActionListenerCommand acs = new ActionSave(d);
	
	public MenuOptions( ActionListenerCommand c1, ActionListenerCommand c2 ) {
		this.aco =c1;
		this.acs=c2;

		}
	
	void clickOpen(){		
		aco.execute();
	}

	void clickSave(){		
		acs.execute();
	}
	

}

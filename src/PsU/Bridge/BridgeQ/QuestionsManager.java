package PsU.Bridge.BridgeQ;

public class QuestionsManager {
	
	protected iQuestions q;
	public String catalog;

	public QuestionsManager(String c ) {
		this.catalog=c;	
		System.out.println("+++++++" + catalog);
	}
	
	
    public void next() {  
    q.nextQts();  
    }  
    public void previous() {  
    q.prevQts();  
    }  
    public void newOne(String quest) {  
    q.newQts(quest);  
    }  
    public void delete(String quest) {  
    q.deleteQts(quest);  
    }  
    public void display() {  
    q.displayQts();  
    }  
    public void displayAll() {  
        System.out.println("Qts Paper: " + catalog);  
    q.displayAllQts();  
    }
}
    

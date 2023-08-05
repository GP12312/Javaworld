package PsU.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject {
	
	int runs;
	int wickets;
	float overs;
	ArrayList<Observer> obList;

	public CricketData() {
		obList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		obList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		obList.remove(obList.indexOf(o));
	}

	@Override
	public void notifyObservers() {
		 for (Iterator<Observer> it = obList.iterator();
				 it.hasNext();
				 )
		 {
			 Observer obs = it.next();
			 obs.update(runs, wickets, overs);
		 }
	}
	
	public int getLatestruns() {		
		return 298;		            // These numbers stated for simplicity
	}

	public int getLatestwickets() {		
		return 8;		
	}
	
	public int getLatestovers() {		
		return 47;		
	}
	
	public void dataReflect() {		
		runs 	= getLatestruns();
		wickets = getLatestwickets();
		overs 	= getLatestovers();
		notifyObservers();
	}
	
}

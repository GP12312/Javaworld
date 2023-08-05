package PsU.MediatorC;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ApnaChatRoomFlow implements ApnaChatRoom {

    //get current date time   
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");  
    Date date = new Date(0);  
    
    

	@Override
    public void showMsg(String msg, Participant p) {  
        
        System.out.println(p.getName()+"sends message: "+msg);  
        System.out.println("@ "+"["+dateFormat.format(date).toString()+"]");    
    }     

}

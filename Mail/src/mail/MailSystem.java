package mail;

import java.util.ArrayList;
import java.lang.*;
  
  
  public class MailSystem
  {
    
     public MailSystem(int mailboxCount)
     {
        mailboxes = new ArrayList<>();

        for (int i = 0; i < mailboxCount; i++)
        {
           String passcode = "" + (i + 1);
           String greeting = "To leave a message, press (1), to access your mailbox, press (2)";
           mailboxes.add(new Mailbox(passcode, greeting));
        }
     }
  

     public Mailbox findMailbox(String ext) throws Exception
     {
    	try
    	{
    		int i = Integer.parseInt(ext);
	        if (1 <= i && i <= mailboxes.size())
	           return  mailboxes.get(i - 1);
	        else return null;
    	}
    		catch( NumberFormatException e)
    	{
    			System.out.println("invalid entry");
    			return null;
    	}
     }
    	 
        
  
     private ArrayList<Mailbox> mailboxes;
  }

package mail;


  public class Message
  {
     /**
        Construct a Message object.
       @param messageText the message text
     */
     public Message(String messageText)
     {
        text = messageText;
     }
 
 
     public String getText()
     {
    	 return text;
     }

     private String text;
  }

package messagetoallmembers;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class CoachMessage {

          public void MessageFunction(String Message) throws FileNotFoundException, IOException
    {
            
        try
            (
               BufferedWriter write = new BufferedWriter(new FileWriter("NewFile"))) {
               write.write(Message);
            }
            
    }

    void MessageFunction(SendMessage s) {
             
        
    }
    
}

    
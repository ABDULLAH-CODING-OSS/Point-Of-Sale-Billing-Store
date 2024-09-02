
package pos_project;

import Entities.Product;
import Entities.Store;
import design_panel.Loading_Screen;
import design_panel.Welcome_Screen;


public class POS_project {

    
    public static void main(String[] args) throws InterruptedException {
        Loading_Screen loading = new Loading_Screen();
        loading.getloadingButton().setText("Loading .");
        
         loading.setVisible(true);
        
        for (int i = 0; i <= 100; i++) {
          
            loading.getprogressBar().setValue(i);
            if (i==25) {
                loading.getloadingButton().setText("Loading..");
                
            }
             if (i==50) {
                loading.getloadingButton().setText("Loading...");
                
            }
              if (i==75) {
                loading.getloadingButton().setText("Loading...");
                
            }
            
            try{
            Thread.sleep(100);
        }
            catch(InterruptedException ex) {
                    System.out.println(ex.getMessage());
               }
           
        }
         loading.setVisible(false);
         loading.dispose();
       
         new Welcome_Screen().setVisible(true);
       
    }
    
}

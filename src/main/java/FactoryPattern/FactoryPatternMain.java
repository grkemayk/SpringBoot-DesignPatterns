package FactoryPattern;

import java.time.Instant;

public class FactoryPatternMain {

	public static void main(String[] args) {

        try 
        {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1997);
            asus.name();

            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();
            

           /*double i = 0;
           double dStartTime = System.currentTimeMillis();
           while(true)
           {
        	   i++;
        	   if(i == 150000000)
        	   {
        		   double dFinishTime = System.currentTimeMillis();
        		   System.out.println("WHILE TRUE: "+ (dFinishTime - dStartTime));
        		   break;
        	   }
           }*/
           
           //DO WHILE Daha hizli calisiyor. Bir kosul olana  kadar calismasini istiyorsan do while kullan.
           
          /* double iDo = 0;
           double dStartTimeDo = System.currentTimeMillis();
           do
           {
        	   iDo++;
        
           }
           while(!(iDo == 150000000));
		   double dFinishTimeDo = System.currentTimeMillis();
		   System.out.println("WHILE DO: "+ (dFinishTimeDo - dStartTimeDo));*/

           /* int iDoTry = 0;
            do
            {
         	   iDoTry++;
         	   System.out.println(iDoTry);
         
            }
            while(true);//While'in ici true oldugu sürece calisir
            */
            

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

	}

}

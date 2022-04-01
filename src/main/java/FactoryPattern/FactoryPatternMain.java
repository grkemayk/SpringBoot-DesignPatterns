package FactoryPattern;

public class FactoryPatternMain {

	public static void main(String[] args) {

        try 
        {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1997);
            asus.name();

            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

	}

}

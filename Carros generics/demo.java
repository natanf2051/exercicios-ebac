import java.util.ArrayList;

public class demo {

    public static void main(String[] args) {
        ArrayList<carros> carros2010 = new ArrayList<>();
        carros cliente = new BMW("X5", 2019);
        carros cliente1 = new Fiat("uno", 2010);
        carros2010.add(cliente);
        carros2010.add(cliente1);
        
        
        System.out.println(carros2010);

    }
    
}

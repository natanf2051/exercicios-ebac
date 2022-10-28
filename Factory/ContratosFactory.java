package Factory;

import Factory.CARROS.Bmw;
import Factory.CARROS.Tesla;

public class ContratosFactory extends Factorys {

    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Tesla(700, "carregado", "Ciza");
        }else{
            return new Bmw(650, "vazio", "marrom");
        }
        
    }


}

package Factory;

import Factory.CARROS.CorollaCar;
import Factory.CARROS.Sw4;

public class SemContratosFactory extends Factorys{

    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new CorollaCar(100, "tanque cheio", "cinza");
        }else{
            return new Sw4(400, "full", "vermelho");
        }
    }

}

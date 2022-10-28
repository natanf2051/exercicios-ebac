package Factory;

public class Demo {
    public static void main(String[] args) {
        Customer cliente = new Customer("A", true);
        Factorys factory = getFactory(cliente);
        Car car =factory.create(cliente.gradeRequest());
        car.startEngine();
    }
    private static Factorys getFactory(Customer cliente){
        if(cliente.hasCompanyContract()){
            return new ContratosFactory();
        }else{
            return new SemContratosFactory();
        }
    }
}

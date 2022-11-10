import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo {
    
    public static void main(String[] args) {
        anotacao();

    
    }

    private static void anotacao(){
        ClasseComAnotação tab = new ClasseComAnotação();
        Annotation[] prod = tab.getClass().getAnnotations();
        
        for(Annotation anot : prod){
            System.out.println("anotacoes " + anot.annotationType());
            //System.out.println("anotacoes " + anot);
        }


        for(Field field : prod.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Tabela.class)){
                System.out.println(prod);

        Tabela ano = field.getAnnotation(Tabela.class);

        System.out.println(ano.toString());
        System.out.println(ano.annotationType());
            }
        }
        if(tab.getClass().isAnnotationPresent(Tabela.class)){
            Tabela ano = tab.getClass().getAnnotation(Tabela.class);
            System.out.println("Nome da anotação: " + ano.toString());
            System.out.println("valor da anotação: " + ano.value());
        }
    }
}


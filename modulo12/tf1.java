package modulo12;

import java.util.Arrays;
import java.util.Scanner;

public class tf1 {
    
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String pessoa = input.nextLine();
    String[] pessoas = pessoa.split(",");
    Arrays.sort(pessoas);  
    
for(int i = 0; i < pessoa.length();i++){
    System.out.println(pessoas[i]);
}
    
     
    


    }

}

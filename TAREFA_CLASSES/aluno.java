package TAREFA_CLASSES;

public class aluno {
    public static void main(String[] args) {
        // criamos o aluno com: notas natan = new notas();
        notas natan = new notas();
        //informamos as notas para calcular a meida
        natan.setNotaFinal("Natan", 8, 8, 6, 9);
        //aqui imprimimos a media obtida
        natan.getnotaFinal();
        
    };
}

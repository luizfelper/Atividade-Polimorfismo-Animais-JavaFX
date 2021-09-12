public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este projeto está no meu repositório do GitHub (github.com/luizfelper) - Atividade de Programação Avançada - JavaFX. \n");

        Animal Cachorro = new Cachorro("Bob", "Poodle", "Au au");
        Animal Gato = new Gato("Bixano", "Vira Lata", "Miau");
        
        Cachorro.mostraDetalhes();
        Gato.mostraDetalhes();
    
    }
}

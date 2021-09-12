public class Gato extends Animal {

    String Miar;

    public Gato(String Nome, String Raca, String Miar) {
        super(Nome, Raca);
        this.Miar = Miar;
    }

    public String getMiar() {
        return Miar;
    }

    public String mostraDetalhes(){
        String Nome = getNome();
        String Raca = getRaca();
        String Miar = getMiar();
        System.out.println("Nome: " + Nome + " | Raça: " + Raca + " | Comunicar: " + Miar);

        return toString();
    }
    
}

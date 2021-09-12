public class Cachorro extends Animal {

    String Latir;

    public Cachorro(String Nome, String Raca, String Latir) {
        super(Nome, Raca);
        this.Latir = Latir;
    }

    public String getLatir() {
        return Latir;
    }

    public String mostraDetalhes(){
        String Nome = getNome();
        String Raca = getRaca();
        String Latir = getLatir();
        System.out.println("Nome: " + Nome + " | Raça: " + Raca + " | Comunicar: " + Latir);

        return toString();
    }
    
}

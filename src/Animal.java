public abstract class Animal {
    String Nome;
    String Raca;

    public Animal (String Nome, String Raca){
        this.Nome = Nome;
        this.Raca = Raca;
    }

    //Getter do nome
    public String getNome() {
        return Nome;
    }
    //Getter da raca
    public String getRaca() {
        return Raca;
    }

    public void setNome (String Nome) {
        this.Nome = Nome;
    }
    //Seeter da raca
    public void setRaca (String Raca) {
        this.Raca = Raca;
    }




}

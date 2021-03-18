public class Treinador {

    private String nome;
    private int idade;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Pokemon pokemon3;
    private int vitorias;
    private int derrotas;

    public Treinador(){
    }

    public Treinador(String nome, int idade, Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3){
        this.nome = nome;
        this.idade = idade;
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.pokemon3 = pokemon3;
    }

    public void ganharDuelo(){
        vitorias++;  
    }
    
    public void perderDuelo(){
        derrotas--;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pokemon getPokemon1() {
        return pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        this.pokemon1 = pokemon1;
    }

    public Pokemon getPokemon2() {
        return pokemon2;
    }

    public void setPokemon2(Pokemon pokemon2) {
        this.pokemon2 = pokemon2;
    }

    public Pokemon getPokemon3() {
        return pokemon3;
    }

    public void setPokemon3(Pokemon pokemon3) {
        this.pokemon3 = pokemon3;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
 
}
public class Pokemon {

    private String nome;
    private String tipo;
    private int poder;
    private int vitorias;
    private int derrotas;

    public Pokemon(){
    }

    public Pokemon(String nome, String tipo, int poder){
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
    }

    public void ganharLuta(){  
       vitorias++;
    }
    
    public void perderLuta(){
        derrotas--;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getPoder(){
        return poder;
    }

    public void setPoder(int poder){
        this.poder = poder;
    }

    public int getVitorias(){
        return vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }

}
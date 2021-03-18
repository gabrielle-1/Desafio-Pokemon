public class Duelo {
    private Treinador treinador1;
    private Treinador treinador2;
    private boolean aprovado;

    public Duelo(){
    }

    public Duelo(Treinador treinador1, Treinador treinador2) {
        this.treinador1 = treinador1;
        this.treinador2 = treinador2;
    }

    public void marcarDuelo(Treinador treinador1, Treinador treinador2){
        if(treinador1!=treinador2){
            this.setAprovado(true);
            this.setTreinador1(treinador1);
            this.setTreinador2(treinador2);
        }
    }

    public void duelar(Pokemon pokemon1, Pokemon pokemon2){
        if(aprovado){
            if(pokemon1.getPoder() > pokemon2.getPoder()){
                System.out.println(treinador1.getNome());
                pokemon1.ganharLuta();
                pokemon2.perderLuta();
                treinador1.ganharDuelo();
                treinador2.perderDuelo();
            } else if(pokemon2.getPoder() > pokemon1.getPoder()){
                System.out.println(treinador2.getNome());
                pokemon2.ganharLuta();
                pokemon1.perderLuta();
                treinador2.ganharDuelo();
                treinador1.perderDuelo();
            }
            
        } else
            System.out.println("Duelo não aprovado!");
    }

    public void resultadoDuelo(){
        if(aprovado){
            if(treinador1.getVitorias() > treinador2.getVitorias())
            System.out.println(treinador1.getNome() + " ganha o duelo");
                else 
                System.out.println(treinador2.getNome() + " ganha o duelo");
    }
}

    public Treinador getTreinador1() {
        return treinador1;
    }

    public void setTreinador1(Treinador treinador1){
        this.treinador1 = treinador1;
    }

    public Treinador getTreinador2(){
        return treinador2;
    }

    public void setTreinador2(Treinador treinador2){
        this.treinador2 = treinador2;
    }

    public boolean isAprovado(){
        return aprovado;
    }

    public void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }
}
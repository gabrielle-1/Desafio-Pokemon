import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Treinador treinador1 = new Treinador();   

            treinador1.setNome(input.next());
            treinador1.setIdade(input.nextInt());

        Pokemon pokemon1_treinador1 = new Pokemon();

        treinador1.setPokemon1(pokemon1_treinador1);

        pokemon1_treinador1.setNome(input.next());
        pokemon1_treinador1.setTipo(input.next());
        pokemon1_treinador1.setPoder(input.nextInt());

        Pokemon pokemon2_treinador1 = new Pokemon();

        treinador1.setPokemon2(pokemon2_treinador1);

        pokemon2_treinador1.setNome(input.next());
        pokemon2_treinador1.setTipo(input.next());
        pokemon2_treinador1.setPoder(input.nextInt());

        Pokemon pokemon3_treinador1 = new Pokemon();

        treinador1.setPokemon3(pokemon3_treinador1);

        pokemon3_treinador1.setNome(input.next());
        pokemon3_treinador1.setTipo(input.next());
        pokemon3_treinador1.setPoder(input.nextInt());

        Treinador treinador2 = new Treinador();   

        treinador2.setNome(input.next());
        treinador2.setIdade(input.nextInt());

        Pokemon pokemon1_treinador2 = new Pokemon();

        treinador2.setPokemon1(pokemon1_treinador2);

        pokemon1_treinador2.setNome(input.next());
        pokemon1_treinador2.setTipo(input.next());
        pokemon1_treinador2.setPoder(input.nextInt());

        Pokemon pokemon2_treinador2 = new Pokemon();

        treinador2.setPokemon2(pokemon2_treinador2);

        pokemon2_treinador2.setNome(input.next());
        pokemon2_treinador2.setTipo(input.next());
        pokemon2_treinador2.setPoder(input.nextInt());

        Pokemon pokemon3_treinador2 = new Pokemon();

        treinador2.setPokemon3(pokemon3_treinador2);

        pokemon3_treinador2.setNome(input.next());
        pokemon3_treinador2.setTipo(input.next());
        pokemon3_treinador2.setPoder(input.nextInt());

        Duelo duelo = new Duelo();
        duelo.marcarDuelo(treinador1, treinador2);
        duelo.duelar(pokemon1_treinador1, pokemon1_treinador2);
        duelo.duelar(pokemon2_treinador1, pokemon2_treinador2);
        duelo.duelar(pokemon3_treinador1, pokemon3_treinador2);
        duelo.resultadoDuelo();
    }
}
package poo;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaGame {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("The sims", "simulacao", 2017, 132);
        Produto produto2 = new Produto("World of Warcraft", "MMORPG", 2014, 230);

        List <String> jogo = Arrays.asList("sudoku", "the sims", "wow", "lol", "subway suffers");
	
	        List <String> jogoS = jogo.stream()
			        .filter(x-> x.toString().startsWith("s"))
			        .sorted()
			        .collect(Collectors.toList());

			System.out.println("\nJogos cujo nome começam com a letra R: " + jogoS);

        produto1.Visualizar();
        System.out.println("-----------------");
        produto2.Visualizar();
    }
}

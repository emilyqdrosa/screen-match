package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("WICKED", 2024);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var terceiroFilme = new Filme("Homem com H", 2025);
        terceiroFilme.avalia(10);
        Serie serie = new Serie("Happiness", 2021);

        Filme f1 = terceiroFilme;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(terceiroFilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Jesuíta Barbosa");
        buscaPorArtista.add("Ariana Grande");
        buscaPorArtista.add("Park Hyungsik");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");

        Collections.sort(lista);

        System.out.println(lista);

        //todos os titulos ele deve comparar o ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
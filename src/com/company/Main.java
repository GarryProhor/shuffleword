package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//	WordReader wordReader = new WordReader("words.txt");
//        List<Word> words = wordReader.getWords();
//        WordChanger changer = new WordChanger();
//        List<Word> changedWords = changer.change(words);
//        int i = 0;
        GameService gameService = new GameService();
        gameService.load("words.txt");
        gameService.run();
    }
}

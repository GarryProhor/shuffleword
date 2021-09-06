package com.company;

import java.util.List;
import java.util.Scanner;

public class GameService {
    private int wordsCount;
    private int currentWordPosition;
    private int playerScore;
    private List<Word> words;

    private Scanner scanner;

    public void load(String fileName){
        WordReader wordReader = new WordReader(fileName);
        List<Word> rawWords = wordReader.getWords();
        WordChanger changer = new WordChanger();
       this.words = changer.change(rawWords);

       this.wordsCount = 0;
       this.playerScore = 0;
       this.wordsCount = words.size();

       scanner = new Scanner(System.in);
    }
    public void run(){
        while(hasNextWords()){
            System.out.println(words.get(currentWordPosition).getChangeValue());
            String playerWord = scanner.nextLine();
            if(playerWord.equals(words.get(currentWordPosition).getValue())){
                System.out.println("УРА");
                playerScore++;
            }else {
                System.out.println("ОШИБКА");
            }
            currentWordPosition++;
        }
        printResult();
    }

    private void printResult() {
        System.out.println("КОЛИЧЕСТВО СЛОВ - " + wordsCount);
        System.out.println("КОЛИЧЕСТВО ПРАВИЛЬНЫХ ОТВЕТОВ - " + playerScore);
        System.out.println("КОЛИЧЕСТВО НЕПРАВИЛЬНЫХ ОТВЕТОВ - " + (wordsCount-playerScore));
    }

    private boolean hasNextWords() {
        return currentWordPosition< wordsCount;
    }
}

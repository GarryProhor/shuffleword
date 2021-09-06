package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class WordReader {
    private  String fileName;

    public WordReader(String fileName) {
        this.fileName = fileName;
    }
    public  List<Word> getWords()  {
        List<Word> words = new ArrayList<>();
        try{
            BufferedReader reader =new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();

            while (line != null){
                Word word = new Word(line);
                words.add(word);
                line = reader.readLine();

            }
            return words;
        } catch (Exception e){
            System.out.println("Произошла ошибка  ");
            System.exit(1);
        }
            return null;
    }
}

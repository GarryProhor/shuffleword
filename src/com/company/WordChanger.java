package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordChanger {
    public List<Word> change(List<Word> source){
        List<Word> changeWords = new ArrayList<>();
        for (Word word: source){
            Word changeWord = change(word);
            changeWords.add(changeWord);
        }
        return changeWords;
    }
    private Word change(Word word){
        String oldWord = word.getValue();
        char[] chars = oldWord.toCharArray();
        List<Character> changedCharacter = new ArrayList<>();
        for(char character : chars) {
             changedCharacter.add(character);
        }
        Collections.shuffle(changedCharacter);

        char[] newChars = new char[changedCharacter.size()];

        for(int i=0; i< newChars.length; i++){
            newChars[i] = changedCharacter.get(i);
        }

        String newWord = new String(newChars);
        return new Word(oldWord, newWord);
    }
}

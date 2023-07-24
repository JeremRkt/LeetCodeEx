package org.leet;

import java.util.stream.IntStream;

public class lengthOfLastWord {
    public static int lastWordLength(String s){
       return (int) IntStream.iterate(s.length() - 1, i ->i >= 0, i-> --i )
               .map(s::charAt)
               .dropWhile(ch -> !Character.isLetter(ch))
               .takeWhile(Character::isLetter)
               .count();
    }
}

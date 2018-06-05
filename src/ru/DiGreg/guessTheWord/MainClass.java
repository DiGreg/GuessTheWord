package ru.DiGreg.guessTheWord;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static Scanner scan = new Scanner(System.in);//создал классовый объект типа Scanner

    public static void main(String[] args) {
        Random random = new Random(); //создаю генератор чисел

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};//задал массив слов

        String computerWord = words[random.nextInt(words.length)];

        System.out.println("Угадай слово! Введи своё: ");
        String userWord;
        do{
            userWord = scan.next();
            scan.nextLine();
            compareWords(computerWord, userWord);
        } while(!computerWord.equals(userWord));

        //System.out.println(computerWord);

    }

    //Метод сравнения слов:
    public static void compareWords(String _computerWord, String _userWord){
        if (_computerWord.equals(_userWord)) {
            System.out.println("Браво!!! Ты угадал слово Компьютера!");
            return;
        }
        else{
            System.out.println("Результат сравнения по буквам: ");
            for (int i = 0; i < 15; i++){
                if (i < _computerWord.length() && i < _userWord.length()){
                    if (_userWord.charAt(i) == _computerWord.charAt(i)){
                        System.out.print(_computerWord.charAt(i));
                    } else System.out.print("#");
                } else  System.out.print("#");
            }
            System.out.println("\nТы не угадал, попробуй ещё: ");
        }
    }
}

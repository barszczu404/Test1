package tasks.app;

import tasks.services.Zad1Service;
import tasks.services.Zad2Service;
import tasks.services.Zad3Service;
import tasks.services.Zad4Service;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Zad1Service s1 = new Zad1Service();
        s1.displayAll3DigitNumbersWhoseSumOfHundredsAndTensEqualUnitsDigit();

        System.out.println("-------------------------------------------");


        Zad2Service s2 = new Zad2Service();
        s2.digitAllDivisorsOfEachTwoDigitNumber();

        System.out.println("-------------------------------------------");


        Zad3Service s3 = new Zad3Service();
        s3.askUserFor10WordsAndDisplayLongestAndShortestWordWithNumberOfLettersItHasAndNumberOfPalindromes();

        System.out.println("-------------------------------------------");


        Zad4Service s4 = new Zad4Service();
        s4.askUserForNumbersSeparatedBySpaceAndCalculateMedianAndDigitAllPrimeNumbers();

    }
}
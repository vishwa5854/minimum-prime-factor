package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<numberOfTestCases;i++) {
            process(scanner.nextInt(),output);
        }
        for(int a : output){
            System.out.println(a);
        }
    }

    private static void process(int targetPrimeFactor, ArrayList<Integer> output){
        int count = 0;
        for(int i=targetPrimeFactor;i<=1000000;i++){
            try {
                ArrayList<Integer> primeFactors = new ArrayList<>();
                primeFactors(i, primeFactors);
                if (targetPrimeFactor == primeFactors.get(0)) {
                    count++;
                }
            }catch (Exception ignored){
            }
        }
        output.add(count);
    }

    private static void primeFactors(int number, ArrayList<Integer> primeFactors ){
        for(int i = 2; i<Math.sqrt(number) + 10; i++) {
            if(number%i == 0) {
                primeFactors.add(i);
                break;
            }
        }
        if(number >2) {
            primeFactors.add(number);
        }
    }
}

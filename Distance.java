package com.gmail.yevgen.v.o;

import java.util.Scanner;

import java.util.ArrayList;

public class Distance {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> numArray = new ArrayList<Integer>();

    public static void main(String[] args) {
        read();
        printDistance();
        scanner.close();
    }

    private static void read(){
        int num;
        do{
            num = scanner.nextInt();
            numArray.add(num);
        }while(scanner.hasNextInt());
    }

    private static void printDistance(){
        int min1 = numArray.get(0);
        int min1Position = 0;
        int min2=numArray.get(0);
        int min2Position=0;
        for(int i = 0;i<numArray.size();i++){
            if(min1>numArray.get(i)){
                min1=numArray.get(i);
                min1Position = i;
            }
        }
        for(int i = 0;i<numArray.size();i++){
            if(min2>=min1 && (min2>numArray.get(i)||min2==numArray.get(i)) && min1Position!=i){
                min2=numArray.get(i);
                min2Position = i;
            }
        }
        int distance = min1Position - min2Position;
        if(distance < 0){
            distance = -distance;
        }
        System.out.println("The smallest number are " + min1 + " and " + min2 +
                ". The distance between them is " + distance);
    }
}

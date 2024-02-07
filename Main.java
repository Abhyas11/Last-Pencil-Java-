package lastpencil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pencils would you like to use: ");
        //int num = scanner.nextInt();
        Random random = new Random();
        int num;
        /*
        while(true){
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
                if(num>0){
                    break;
                } else if (num<0) {
                    System.out.println("The number of pencils should be numeric");
                } else if (num.) {
                    
                } else {
                    System.out.println("The number of pencils should be positive");
                }
            }else{
                System.out.println("The number of pencils should be numeric");
                scanner.next();
            }
        }
        */
        while (true) {
            String input = scanner.nextLine().trim(); // Read the entire line and trim leading/trailing spaces

            if (input.isEmpty()) {
                System.out.println("The number of pencils should be numeric");
            } else {
                try {
                    num = Integer.parseInt(input);

                    if(num>0){
                        break;
                    } else if (num<0) {
                        System.out.println("The number of pencils should be numeric");
                    }else {
                        System.out.println("The number of pencils should be positive");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("The number of pencils should be numeric");
                }
            }
        }

        //int num = scanner.nextInt();
        System.out.println("Who will be the first (John, Jack): ");
        String name = "";
        while(true){
            name = scanner.nextLine();
            if("John".equals(name)||"Jack".equals(name)){
                break;
            }else {
                System.out.println("Choose between John and Jack");
            }
        }
        for(int i=0; i<num; i++){
            System.out.print("|");
        }
        System.out.println();
        int newNum = 0;
        String current="";

        while(num!=0){

            switch(name){
                case "John":
                    System.out.println("John's turn");
                    current = "John";
                    name = "Jack";
                    break;
                case "Jack":
                    System.out.println("Jack's turn");
                    current = "Jack";
                    name = "John";
                    break;
            }
            //newNum = scanner.nextInt();
            //int newNum;
            if(current.equals("John")) {
                while (true) {

                    //if(scanner.hasNextInt()) {
                    //    newNum = scanner.nextInt();
                    //    if (newNum <1 || newNum > 3) {
                    //        System.out.println("Possible values: '1', '2' or '3'");
                    //       System.out.println(current+"'s turn!");
                    //   } else if (newNum > num) {
                    //       System.out.println("Too many pencils were taken");
                    //      System.out.println(current+"'s turn!");
                    //   } else {
                    //      break;
                    //  }
                    //}else {
                    //    System.out.println("Possible values: '1', '2' or '3'");
                    //    System.out.println(current+"'s turn!");
                    //   scanner.next();
                    //}
                    String newInput = scanner.nextLine().trim(); // Read the entire line and trim leading/trailing spaces

                    if (newInput.isEmpty()) {
                        System.out.println("Possible values: '1', '2' or '3'");
                        System.out.println(current + "'s turn");
                    } else {
                        try {
                            newNum = Integer.parseInt(newInput);

                            if (newNum < 1 || newNum > 3) {
                                System.out.println("Possible values: '1', '2' or '3'");
                                //System.out.println(current+"'s turn");
                            } else if (newNum > num) {
                                System.out.println("Too many pencils were taken");
                                //System.out.println(current+"'s turn");
                            } else {
                                //System.out.println(current+"'s turn");
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Possible values: '1', '2' or '3'");
                            //System.out.println(current+"'s turn");
                        }
                    }
                }
            }else if(current.equals("Jack")){
                if(num%4==1){
                    newNum = random.nextInt(3-1+1)+1;

                } else if (num%4==2) {
                    newNum = 1;

                } else if (num==1) {
                    newNum =1;

                } else if (num%4==3) {
                    newNum = 2;


                } else if (num%4==0) {
                    newNum = 3;


                }
                System.out.println(newNum);
            }
            num = num - newNum;
            for(int i =0; i<num; i++){
                System.out.print("|");
            }
            System.out.println();
            //num = n;
        }
        System.out.println(name + " won!");

    }

}

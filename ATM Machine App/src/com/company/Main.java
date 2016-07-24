package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int pin = 1234;
        int amount = 50000;

        Scanner input = new Scanner(System.in);

        print("Enter Pin: ");
        int inputPin = input.nextInt();
        if(pin!=inputPin){
            print("invalid Pin");
        }else{

            boolean loop = true;
            do{
                print("Wellcome to ATM App");
                print("1. Withdwaw Amount");
                print("2. Deposit Amount");
                print("3. View Amount");
                print("4. Exit");

                int choice = input.nextInt();

                switch(choice){
                    case 1:
                        print("Enter Desired Amount to Withdraw: ");
                        int withDrawAmount = input.nextInt();

                        if(withDrawAmount < 1){
                            print("zeronot allowed");
                        }else if(withDrawAmount > amount){
                            print("Amount is more then your amount, not allowed");
                        }else if(withDrawAmount < amount){
                            print("zeronot allowed");
                        }else if(withDrawAmount == 0){
                            print("zeronot allowed");
                        }else

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }

            }while(loop){

            }
        }




    }


    public static void print(String line) {
        System.out.println(line);
    }
}

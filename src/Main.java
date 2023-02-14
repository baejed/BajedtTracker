import CashLog.Transact;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Transact transact = new Transact();
        Scanner choice = new Scanner(System.in);
        int menuChoice;


        System.out.println("[1] Log-in cash");
        System.out.println("[2] Log-out cash");
        System.out.println("[3] Display cash log");
        System.out.print(": ");

        menuChoice = choice.nextInt();

        switch (menuChoice) {
            case 1 -> transact.cashInFlow();
            case 2 -> transact.cashOutFlow();
            case 3 -> transact.displayLog();
        }

    }

}
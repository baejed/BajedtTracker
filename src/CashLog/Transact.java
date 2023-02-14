package CashLog;

import java.io.*;
import java.util.Scanner;

public class Transact {

    double temp = 0, FINAL, depositOrWithdraw;
    String source;

    FileWriter balance = new FileWriter("C:\\Users\\bajed\\IdeaProjects\\BajedtTracker\\Data\\BalanceLog.txt", true);
    BufferedWriter balanceWriter = new BufferedWriter(balance);
    PrintWriter printWriter = new PrintWriter(balanceWriter);
    Scanner readBalance = new Scanner(new File("C:\\Users\\bajed\\IdeaProjects\\BajedtTracker\\Data\\BalanceLog.txt"));
    Scanner inputReceiver = new Scanner(System.in);

    public Transact() throws IOException {
    }

    public void cashInFlow() throws IOException {

        while (readBalance.hasNext()) {
            try {
                temp = Double.parseDouble(readBalance.next());
            } catch (NumberFormatException e) {

            }
        }

        System.out.println("Current balance: " + temp);

        System.out.print("Cash in-flow: ");
        depositOrWithdraw = inputReceiver.nextDouble();

        System.out.print("Source: ");
        source = inputReceiver.next();

        FINAL = temp + depositOrWithdraw;

        printWriter.print(FINAL);
        printWriter.printf(" %s(+%.2f)\n", source, depositOrWithdraw);

        printWriter.flush();
        printWriter.close();
    }

    public void cashOutFlow() throws IOException {

        while (readBalance.hasNext()) {
            try {
                temp = Double.parseDouble(readBalance.next());
            } catch (NumberFormatException e) {

            }
        }

        System.out.println("Current balance: " + temp);

        System.out.print("Cash out-flow: ");
        depositOrWithdraw = inputReceiver.nextDouble();

        if (temp > depositOrWithdraw) {
            System.out.print("Purpose: ");
            source = inputReceiver.nextLine();
            source = inputReceiver.nextLine();

            FINAL = temp - depositOrWithdraw;

            printWriter.print(FINAL);
            printWriter.printf(" %s(-%.2f)\n", source, depositOrWithdraw);

            printWriter.flush();
            printWriter.close();
        } else {
            System.out.println("Insufficient balance");
        }

    }

    public void displayLog() {

        System.out.println("\nCash Log: ");

        while (readBalance.hasNext()) {
            System.out.print(readBalance.next());
            System.out.println(readBalance.nextLine());
        }

    }

}

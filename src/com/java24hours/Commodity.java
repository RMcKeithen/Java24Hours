package com.java24hours;

class Commodity {
    public static void main(String[] arguments) {
        String command = "Buy";
        int balance = 550;
        int quantity = 42;

        switch (command) {
            case "Buy":
                quantity += 5;
                balance -= 20;
                break;
            case "Sell":
                quantity -= 5;
                balance += 15;
        }
        System.out.println("Balance: $" + balance + "\n"
            + "Quantity: " + quantity);
        }
}
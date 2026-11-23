package com.pluralsight;

import com.pluralsight.assets.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House(
                "Primary Residence",
                "2020-06-15",
                250000.00,
                "123 Main St",
                350000.00));

        assets.add(new BankAccount(
                "Checking Account",
                "2024-01-01",
                5000.00,
                "123456789",
                5500.00));

        assets.add(new Gold(
                "Gold Coins",
                "2023-05-01",
                8000.00,
                10.0,
                2300.00));

    }
}
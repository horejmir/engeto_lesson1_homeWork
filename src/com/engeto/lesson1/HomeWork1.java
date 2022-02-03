package com.engeto.lesson1;

import java.time.LocalDate;
import java.util.Arrays;

public class HomeWork1 {

    public static void main(String[] args) {

           /*

            V metodě main vytvoř následující proměnné:
            - Jméno klienta — budeme ukládat jména a příjmení klientů
            - Počet nákupů — kolik zákazníků si koupilo tento výrobek
            - Název města, kde firma sídlí.
            - Spotřeba vozidla v litrech na 100 km.
            - Množství kabelů — délka UTP kabelu na skladě v metrech.
            - Datum narození klienta.
            - Registrační značka vozidla („SPZ“).
            - IP adresa verze 4. (Viz například IP adresa verze 4)\

            */

        String clientName = "Karel Novák";
        System.out.println(clientName);

        int itemSoldCounter = 0;
        System.out.println(itemSoldCounter);

        String companyAdrressTown = "Třeboň";
        System.out.println(companyAdrressTown);

        double fuelConsumption = 5.2;
        System.out.println(fuelConsumption);

        int cableStockSupply = 326;
        System.out.println(cableStockSupply);

        LocalDate clientDateOfBirth = LocalDate.of(1984, 06,20);
        System.out.println(clientDateOfBirth);

        String plateNumber = "2C02345";
        System.out.println(plateNumber);

        short[] ipAdrress = {10, 0, 0, 127};
        System.out.println(Arrays.toString(ipAdrress));

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;

public class CricketRunsReport {

static class Record {
    String player;
    String stadium;
    int runs;

    Record(String player, String stadium, int runs) {
        this.player = player;
        this.stadium = stadium;
        this.runs = runs;
    }
}

public static void main(String[] args) {
    ArrayList<Record> records = new ArrayList<>();
    records.add(new Record("Jacques Kallis", "KINGSMEAD", 5000));
    records.add(new Record("Jacques Kallis", "ST GEORGES", 3500));
    records.add(new Record("Jacques Kallis", "WANDERERS", 6200));

    records.add(new Record("Hashim Amla", "KINGSMEAD", 3800));
    records.add(new Record("Hashim Amla", "ST GEORGES", 3700));
    records.add(new Record("Hashim Amla", "WANDERERS", 5000));

    records.add(new Record("AB de Villiers", "KINGSMEAD", 4200));
    records.add(new Record("AB de Villiers", "ST GEORGES", 3500));
    records.add(new Record("AB de Villiers", "WANDERERS", 5200));

    System.out.println("RUNS REPORT");
    for (Record r : records) {
        System.out.println(r.player + " scored " + r.runs + " runs at " + r.stadium);
    }

    HashMap<String, Integer> totals = new HashMap<>();
    for (Record r : records) {
        totals.put(r.stadium, totals.getOrDefault(r.stadium, 0) + r.runs);
    }

    System.out.println("\nTOTAL RUNS BY STADIUM");
    for (String stadium : totals.keySet()) {
        System.out.println(stadium + " total: " + totals.get(stadium));
    }

    String maxStadium = "";
    int maxRuns = 0;
    for (String stadium : totals.keySet()) {
        if (totals.get(stadium) > maxRuns) {
            maxRuns = totals.get(stadium);
            maxStadium = stadium;
        }
    }

    System.out.println("\nMOST RUNS AT: " + maxStadium);
}

}
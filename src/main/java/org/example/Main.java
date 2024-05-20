package org.example.example;

public class Main {

    public static void main(String[] args) {

        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        System.out.println(databaseQueryService.findMaxProjectsCountClient());
        System.out.println(databaseQueryService.findLongestProject());
        System.out.println(databaseQueryService.findMaxSalaryWorker());
        System.out.println(databaseQueryService.findYoungestEldestWorker());
        System.out.println(databaseQueryService.printProjectPrices());

    }

}
package com.company;

public class Main {

    public static void main(String[] args) {

        Days days = Days.FRIDAY;

        switch (days) {
            case MONDAY -> System.out.println("Дуйшомбу куну джава боюнча теориялык сабак болот!");
            case TUESDAY -> System.out.println("Шаршемби куну софтскилс сабагына катышам!");
            case WEDNESDAY -> System.out.println("Шейшемби куну откон темаларга практика кылып, теорилык сабакка барам!");
            case THURSDAY -> System.out.println("Бейшемби куну англис тилине жана практикалык сабакка барам!");
            case FRIDAY -> System.out.println("Жума куну теориялык сабак болот! ");
            case SATURDAY -> System.out.println("Ишемби куну кошумча джава сабагына келем!");
            case SUNDAY -> System.out.println("Жекшемби куну эс алам, башк иштер менен алек болом!");

        }
    }
}


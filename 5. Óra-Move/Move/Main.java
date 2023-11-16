package org.example;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Snake s1 = new Snake(0.01, 0.01, "naked");
                Animal s2 = new Snake(0.02, 0.01, "with shell");
                Move s3 = new Snake(0.025, 0.02, "water");

                System.out.println(s1.getSnakeType());
                System.out.println(s2.getSound());
                System.out.println(s3.getSpeedInMeterPerSec()); //nem adja az összes metódust!!!
                System.out.println(s3); //a snake tostringje van meghivva

                Wind w1 = new Wind("north", 10);
                Move w2 = new Wind("south", 20);

                System.out.println(w1.getDirection());
                System.out.println(w2.getSpeedInMeterPerSec());
                System.out.println(w2);

                Lorry l1 = new Lorry(8, 1500, 100, 10000, 10000);
                MeansOfTransport l2 = new Lorry(6, 1000, 100, 800, 1000);

                Frog f1 = new Frog(0.1, 0.1);
                Animal f2 = new Frog(0.2, 0.2);
                Move f3 = new Frog(0.3, 0.3);

                Horse h1 = new Horse(31, 5, 300, "Alma", "white", LocalDate.of(2019, 6, 10));
                Animal h2 = new Horse(32, 100, 300, "Borcsa", "white", LocalDate.of(2020, 7, 11));
                Move h3 = new Horse(33, 100, 300, "Csiha", "white", LocalDate.of(2021, 6, 10));
                MeansOfTransport h4 = new Horse(34, 100, 300, "Dini", "white", LocalDate.of(2022, 3, 1));
                System.out.println(h4);

                Snake[] snakesArray = new Snake[5];
                snakesArray[0] = s1;
                snakesArray[1] = (Snake) s2;
                snakesArray[2] = (Snake) s3;
                snakesArray[3] = new Snake(0.04, 0.04, "water");
                snakesArray[4] = new Snake(0.04, 0.04, "naked");

                Arrays.sort(snakesArray, new Comparator<Snake>() {

                        @Override
                        public int compare(Snake o1, Snake o2) {
                                return Double.compare(o1.getSpeedInMeterPerSec(), o2.getSpeedInMeterPerSec());
                        }
                });

                for (Snake snake : snakesArray) {
                        System.out.println(snake);
                }
                System.out.println("------------------");
                List<Horse> lovak=new ArrayList<Horse>();
                lovak.add(h1);
                lovak.add((Horse)h2);
                lovak.add((Horse)h3);
                lovak.add(new Horse(31,150,86,"paci","fekete", LocalDate.now()));
                lovak.add(new Horse(60,200,86,"szilaj","barna", LocalDate.now()));
                Collections.sort(lovak);
                for (Horse horse : lovak) {
                        System.out.println(horse);
                }
                System.out.println("------------------");
                Collections.sort(lovak);
                for (Horse horse : lovak) {
                        System.out.println(horse);
                }
        }
}
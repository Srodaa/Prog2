package org.example;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        int i = 0;
        ArrayList<Konyv> konyvek = new ArrayList<>();
        // System.out.println("hello");
        try (Scanner sc = new Scanner(new File("konyv.txt"))) {
            // System.out.println("hello2");
            // String sor2 = sc.nextLine();
            // System.out.println(sor2);
            while (sc.hasNextLine()) {
                // System.out.println("hello3");
                String sor = sc.nextLine();
                // System.out.println(sor);
                String[] sorElemek = sor.split(";");
                // for (String e : sorElemek)
                // System.out.println(e);

                if (i != 0) {
                    Konyv k1;
                    try {
                        k1 = new Konyv(sorElemek[0], sorElemek[1], sorElemek[2], sorElemek[3],
                                LocalDate.parse(sorElemek[4], DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                                Integer.parseInt(sorElemek[5]), sorElemek[6], Integer.parseInt(sorElemek[7]));
                    } catch (ArrayIndexOutOfBoundsException e1) {
                        try {
                            k1 = new Konyv(sorElemek[0], sorElemek[1], sorElemek[2], sorElemek[3],
                                    LocalDate.parse(sorElemek[4], DateTimeFormatter.ofPattern("yyyy.MM.dd")),
                                    Integer.parseInt(sorElemek[5]), sorElemek[6], null);
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            k1 = new Konyv(sorElemek[0], sorElemek[1], sorElemek[2], null, null, null, null, null);
                        }

                    }

                    konyvek.add(k1);
                }
                i++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
        i = 0;

        for (Konyv konyv : konyvek) {
            System.out.println(konyv);
        }

        Map<String, List<Konyv>> kny = konyvek.stream()
                .filter(e -> e.getKiado() != null && e.getCim().startsWith("A"))
                .collect(Collectors.groupingBy(Konyv::getKiado));

        System.out.println("----------------");
        for (Map.Entry<String, List<Konyv>> entry : kny.entrySet()) {
            String key = entry.getKey();
            List<Konyv> value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}


package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Building> buildings = new HashSet<>();
        buildings.add(new Building("deik", "kassai 26"));
        buildings.add(new Building("deik", "kassai 28"));
        buildings.add(new Building("DEIK", "kassai 27"));
        buildings.add(new Building("teokj", "kassai 26"));
        buildings.add(new Building("kémia", "egyetem tér 1"));
        buildings.add(new Building("deik", "kassai 26"));

        System.out.println(buildings);

        for (Building building : buildings) {
            System.out.println(building);
        }

        TreeSet<Room> rooms = new TreeSet<>();
        rooms.add(new Room(new Building("foepulet", "egyetem tér 1"), "aud max"));
        rooms.add(new Room(new Building("deik", "kassai 26"), "f0"));
        rooms.add(new Room(new Building("deik", "kassai 26"), "f0"));
        System.out.println("hehe");
        Room r1=new Room(new Building("deik", "kassai 26"), "f1");
        r1.setNumberOfSeats(100);
        r1.addAttribute("eloado");
        r1.addAttribute("projektor");
        rooms.add(r1);

        System.out.println(rooms);

        for (Room room : rooms) {
            System.out.println(room);
        }

        TreeSet<Room> rooms2 = new TreeSet<>(new Comparator<Room>() {

            @Override
            public int compare(Room o1, Room o2) {
                return o1.getRoomId().compareTo(o2.getRoomId());
            }
        });

        System.out.println("hehe");
        rooms2.add(r1);
        rooms2.add(new Room(new Building("deik", "kassai 26"), "f0"));
        rooms2.add(new Room(new Building("deik", "kassai 26"), "f1"));
        rooms2.add(new Room(new Building("foepulet", "egyetem ter 1"), "f1"));
        rooms2.add(new Room(new Building("foepulet", "egyetem ter 1"), "f0"));

        System.out.println(rooms2);
    }
}
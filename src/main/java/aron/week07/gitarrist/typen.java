package aron.week07.gitarrist;

import gyula.week07.personen.Person;

public class typen {
    public static void main(String[] args) {

        AkustikGitarre[] list = {

                new AkustikGitarre("Scheckter", "1/8", 4,"Konzert"),
                new AkustikGitarre("Fender", "1/4", 4,"Western"),
                new AkustikGitarre("Yamaha", "1/2", 4,"Roundback"),
                new AkustikGitarre("Ibanez", "3/4", 4,"Folk"),
        };
        printGitarreList(list);
    }

    private static void printGitarreList(AkustikGitarre[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
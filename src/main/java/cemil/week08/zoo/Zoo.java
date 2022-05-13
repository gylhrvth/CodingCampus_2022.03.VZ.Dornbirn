package cemil.week08.zoo;


import gyula.week08.zoo.Enclosure;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Zoo {
    private String name;
    private int foundationDate;
    private List<AnimalArea> animalAreas = new Vector<>();
    private List<AnimalKeeper> animalKeepers = new Vector<>();
    private List<Feed> feeds = new Vector<>();
    private List<Veterian> veterians = new Vector<>();

    public Zoo(String name, int yearOfEstablishment) {
        this.name = name;
        this.foundationDate = yearOfEstablishment;
    }


    public AnimalKeeper addKeeper(AnimalKeeper ak) {
        animalKeepers.add(ak);
        return ak;
    }

    public void addArea(AnimalArea area) {
        if (!animalAreas.contains(area)) {
            animalAreas.add(area);
        }
    }


    public void removeArea(AnimalArea area) {
        animalAreas.remove(area);
    }

    public void takeCareOfZooAreas() {
        for (AnimalKeeper animalKeeper : animalKeepers) {
            System.out.println(MainZoo.ANSI_GREEN + animalKeeper.getName() + ": " + MainZoo.ANSI_RESET);
            animalKeeper.printListAreasWork();
            System.out.println();
        }

        System.out.println();
    }

    public void simulate(int day) {
        HashMap<Feed, Integer> feedStatistik = new HashMap<>();

        System.out.println(MainZoo.ANSI_BLUE + "Start day " + day + MainZoo.ANSI_RESET);
        for (AnimalKeeper ak : animalKeepers) {
            ak.simulate(day, feedStatistik);
        }

        printStatistc(feedStatistik);
        for (AnimalArea animalArea : animalAreas) {
            animalArea.simulateAttack();
        }
        printStructure();
//        for (Veterian vet:veterians) {
//            vet.simulate();
//        }
    }

    public Animal getAnimalWithMinHealth() {
        Animal result = null;
        for (AnimalArea aa : animalAreas) {
            Animal animalNeed = aa.getAnimalWithMinHealth();
            if (result == null) {
                result = animalNeed;
            } else if (animalNeed != null) {
                double relHealthOfResult = result.getHealthy() / (double) result.getHealthyMax();
                double relHealthOfResultNeed = animalNeed.getHealthy() / (double) animalNeed.getHealthyMax();
                if (relHealthOfResultNeed < relHealthOfResult) {
                    result = animalNeed;
                }
            }

        }
        return result;
    }

    public Feed searchFoodByName(String name) {
        for (Feed f : feeds) {
            if (f.getName().equals(name)) {
                return f;
            }

        }
        return addFeed(name);
    }

    public Feed addFeed(String name) {
        Feed feed = new Feed(name, "", 0);
        feeds.add(feed);
        return feed;
    }

    private void printStatistc(HashMap<Feed, Integer> feedStatistik) {
        System.out.println("Feed statistic:");
        for (Feed f : feedStatistik.keySet()) {
            System.out.printf("%-20s %5d %-8s %7d%n", f.getName(), feedStatistik.get(f), f.getUnit(), (feedStatistik.get(f) * f.getUnitPrice()));
        }
    }
    public void printStructure(){

        System.out.println();
        System.out.println("Tierärzte: ");
        for (Veterian vet:veterians) {
            vet.printStructure();
        }
    }

    @Override
    public String toString() {
        return toString("");
    }

    public String toString(String indentation) {
        String output = indentation + " ";
        output += name;
        output += ", founded in " + foundationDate + "\n";
        for (AnimalArea en : animalAreas) {
            output += "│" + "    " + en.toString(indentation + " ") + "\n";
        }
        return output;
    }

    public void addVeterian(Veterian vet) {
        if (!veterians.contains(vet)){
            veterians.add(vet);
        }
    }
}

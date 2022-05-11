package sergej.week07.zoo;


import java.util.Vector;

public class AnimalCarer {

    private String name;
    private Zoo zoo;
    private Vector<Enclosure> dailyTasks;

    public AnimalCarer(Zoo zoo, String name){
        this.name = name;
        this.zoo = zoo;
        dailyTasks = new Vector<>();
        zoo.addAnimalCarer(this);
    }

    public void addTaskToDailyTasks(String enclosureName){
        Enclosure enc = zoo.searchEnclosureByName(enclosureName);
        if (!dailyTasks.contains(enc)){
            dailyTasks.add(enc);
        }
    }

    public void printStructure() {
        System.out.print("    " + name + " ist zuständig für (");
        for (int i = 0; i < dailyTasks.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(dailyTasks.get(i).getName());
        }
        System.out.println(")");
    }

    public void simulate(int tag) {
        for (Enclosure enc: dailyTasks){
            if (enc.getLastDayOfCleaning() != tag) {
                System.out.println(name + ": ich reinige dass Gehege " + enc.getName() + ".");
                enc.setLastDayOfCleaning(tag);
            } else {
                System.out.println(name + ": dass Gehege " + enc.getName() + " wurde schon gereinigt.");
            }
        }
    }

}

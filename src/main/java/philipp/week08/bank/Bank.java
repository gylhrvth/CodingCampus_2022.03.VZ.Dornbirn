package philipp.week08.bank;

public class Bank {
    private static Customer[] customers = {
            new Customer("Customer 01", 152.44, true),
            new Customer("Customer 02", 327.20, true),
            new Customer("Customer 03", 564.51, false),
            new Customer("Customer 04", 522.22, false),
            new Customer("Customer 05", 15.15, true),
            new Customer("Customer 06", 124.56, true),
            new Customer("Customer 07", 488.00, true),
            new Customer("Customer 08", 7.85, false),
            new Customer("Customer 09", 600.00, false),
            new Customer("Customer 10", 164.88, false)};

    private static Counter[] counters = {
            new Counter("Counter 01", 0, true),
            new Counter("Counter 02", 1000, true),
            new Counter("Counter 03", 1000, true),
//                new Counter("Counter 04",1000,true),
//                new Counter("Counter 05", 1000, true)
    };

    public static void main(String[] args) {
        bankSimulation(customers, counters);

    }

    private static void bankSimulation(Customer[] customerInput, Counter[] counterInput) {
        int counterBreakOrRefillMoney = 1;
        for (Customer customer : customerInput) {
//            System.out.println("-----");
//            printCounters();
            System.out.println("-----");
            System.out.println(customer.getName());
            for (Counter co : counterInput) {
                if (co.getCounterRefill()) {
                    co.setCounterRefillTime(co.getCounterRefillTime() + counterBreakOrRefillMoney);
                }
                if (co.getCounterBreak()) {
                    co.setCounterBreakTime(co.getCounterBreakTime() + counterBreakOrRefillMoney);
                }
                co.checkIfOnBreakForRefill();
                co.checkIfOnBreak();
            }
            for (Counter counter : counterInput) {
                if (customer.getMoney() == 0) {
                    break;
                }
                if (counter.getCounterOpen()) {
                    if (counter.checkNoMoney(customer)) {
                        counter.moneyBusiness(customer);
                        counter.setCounterToBreak();
                    }
                } else {
                    System.out.println(customer.getName() + " wants to go to " + counter.getName() + ", but");
                    System.out.println("\033[0;35m" + counter.getName() + " is closed." + "\033[0m");
                    System.out.println();
                }
            }
        }
    }

    private static void printCounters() {
        for (Counter counter : counters) {
            System.out.println(counter.toString());
        }

    }
}



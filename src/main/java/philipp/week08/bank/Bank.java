package philipp.week08.bank;

public class Bank {
    private static Customer[] customers = {
            new Customer("Customer 01", 156.52, true),
            new Customer("Customer 02", 327.20, true),
            new Customer("Customer 03", 564.51, false),
            new Customer("Customer 04", 222.22, false),
            new Customer("Customer 05", 15.15, true),
            new Customer("Customer 06", 124.56, true),
            new Customer("Customer 07", 488.00, true),
            new Customer("Customer 08", 7.85, false),
            new Customer("Customer 09", 600.00, false),
            new Customer("Customer 10", 164.88, false)};

    private static Counter[] counters = {
            new Counter("Counter 01", 1000, true),
            new Counter("Counter 02", 1000, false),
            new Counter("Counter 03", 1000, true),
//                new Counter("Counter 04",1000,true),
//                new Counter("Counter 05", 1000, true)
    };

    public static void main(String[] args) {
        bankSimulation(customers, counters);

    }

    private static void bankSimulation(Customer[] customerInput, Counter[] counterInput) {
        for (Customer c : customerInput) {
            for (Counter counter : counterInput) {
                if (c.getMoney() == 0) {
                    continue;
                }
                if (counter.getCounterOpen()) {
                    counter.moneyBusiness(c);
                } else {
                    System.out.println(counter.getName() + " is occupied or closed.");
                    System.out.println();
                }
            }
        }
    }
}


package philipp.week08.bank;

import java.util.List;
import java.util.Vector;

public class Bank {
    private String name;
    private Customer customer = new Customer("", 0, true);

//    private Customer[] customers = {
//            new Customer("Customer 01", 152.44, true),
//            new Customer("Customer 02", 327.20, true),
//            new Customer("Customer 03", 564.51, false),
//            new Customer("Customer 04", 522.22, false),
//            new Customer("Customer 05", 15.15, true),
//            new Customer("Customer 06", 124.56, true),
//            new Customer("Customer 07", 488.00, true),
//            new Customer("Customer 08", 7.85, false),
//            new Customer("Customer 09", 600.00, false),
//            new Customer("Customer 10", 164.88, false)};

    private static Counter[] counters = {
            new Counter("Counter 01", 0, true),
            new Counter("Counter 02", 1000, true),
            new Counter("Counter 03", 1000, true),
//                new Counter("Counter 04",1000,true),
//                new Counter("Counter 05", 1000, true)
    };

    private static CounterV2[] countersV2 = {
            new CounterV2("Counter 01", 0, CounterV2.COUNTER_STATUS.FREE),
            new CounterV2("Counter 02", 1000, CounterV2.COUNTER_STATUS.FREE),
            new CounterV2("Counter 03", 1000, CounterV2.COUNTER_STATUS.FREE),
//                new Counter("Counter 04",1000,true),
//                new Counter("Counter 05", 1000, true)
    };

    public Bank(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("Bank");
//        bank.bankSimulation(counters);
        bank.bankSimulationV2(countersV2);

    }

    private void bankSimulationV2(CounterV2[] counterInput) {
        for (int i = 1; i < 11; i++) {
            customer.generateCustomer(i);
            while (customer.getMoney() > 0) {
                System.out.println("-----");
                System.out.println(customer.getName());
                for (CounterV2 co : counterInput) {
                    co.counterState();
                }
                for (CounterV2 counter : counterInput) {
                    if (customer.getMoney() == 0) {
                        break;
                    }
//                        if (counter.getCounterStatus() != CounterV2.COUNTER_STATUS.FREE) {
//                            System.out.println(customer.getName() + " wants to go to " + counter.getName() + ", but");
//                            System.out.println("\033[0;35m" + counter.getName() + " is closed." + "\033[0m");
//                        }
                        counter.setCounterStatus(customer);

                }
            }
        }
        System.out.println("==========");
        for (CounterV2 counter : counterInput) {
            counter.statistic();
        }
    }

    private void bankSimulation(Counter[] counterInput) {
        //        for (Customer customer : customerInput) {
////            System.out.println("-----");
////            printCounters();
        for (int i = 1; i < 11; i++) {
            customer.generateCustomer(i);
            while (customer.getMoney() > 0) {
                System.out.println("-----");
                System.out.println(customer.getName());
                for (Counter co : counterInput) {
                    co.counterState();
                }
                for (Counter counter : counterInput) {
                    if (customer.getMoney() == 0) {
                        break;
                    }
                    if (counter.getCounterOpen()) {
                        if (counter.checkNoMoney(customer)) {
                            counter.getStats().add(new Customer(customer.getName(), customer.getMoney(), customer.getDeposit()));
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
        System.out.println("==========");
        for (Counter counter : counterInput) {
            counter.statistic();
        }
    }

    private static void printCounters() {
        for (Counter counter : counters) {
            System.out.println(counter.toString());
        }

    }
}



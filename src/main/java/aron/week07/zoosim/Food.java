package aron.week07.zoosim;


    public class Food {
        private String name;
        private int unit;
        private int unitPrice;


        public Food(String name,int unit, int unitPrice) {
            this.name = name;
            this.unit = unit;
            this.unitPrice = unitPrice;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUnit() {
            return unit;
        }

        public void setUnit(int unit) {
            this.unit = unit;
        }

        public int getUnitPrice() {
            return unitPrice;
        }

        @Override
        public String toString() {
            return "Food{" +
                    "name='" + name + '\'' +
                    ", unit=" + unit +
                    ", unitPrice=" + unitPrice +
                    '}';
        }
    }



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class hw_java8 {
    public abstract static class CreditCard {
        String holdername;
        String cardnumber;
        static double accountBalance;
        String cardType;

        public CreditCard() {
        }

        abstract boolean isCardAccepted(String cardType);

        public void payBills(double bill) {
            this.accountBalance = this.accountBalance - bill;
        }

        // static polymorphism: method overload.
        public void payBills(int bill) {
            accountBalance = -(double) bill;
        }

        public void refund(double bill) {
            accountBalance = accountBalance + bill;
        }

        public class MasterCard extends CreditCard {

            public MasterCard(String name, String num, double balance) {
                super();
                super.holdername = name;
                super.cardnumber = num;
                super.cardType = "Master";
                super.accountBalance = balance;
            }

            @Override
            boolean isCardAccepted(String cardType) {
                if (cardType.equals("Master")) {
                    return true;
                }
                return false;
            }

            public void main(String[] args) {
                CreditCard boa = new MasterCard("Sana", "10020004", 200.0);
                boa.payBills(30.0);
                refund(20);
                System.out.println(boa.accountBalance);
            }
        }

        public class Joining {
            public void main(String[] args) {
                String s = "string";
                String res = Arrays.asList(s.split("(?i)wal")).stream().collect(Collectors.joining("sams"));
                System.out.println(res);
            }
        }

        public class GroupingBY {
            public void main(String[] args) {
                List<String> strList = Arrays.asList("Eclipse", "eclipse", "Eclipse", "eclipse", "amc", "clip",
                        "ECLIPSE");
                Map<String, Integer> res = strList.stream()
                        .collect(Collectors.groupingBy(o -> o, () -> new TreeMap<>(String.CASE_INSENSITIVE_ORDER),
                                Collectors.summingInt(o -> 1)));
                System.out.println(res);
            }
        }
    }
}

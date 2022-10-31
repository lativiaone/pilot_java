public class hw_oop {
    // 1
    public interface DatabaseConnection {
        public DatabaseConnection getConnection();
    }

    public class OracleConnection implements DatabaseConnection {
        @Override
        public OracleConnection getConnection() {
            return new OracleConnection();
        }

    }

    public class MySqlConnection implements DatabaseConnection {
        @Override
        public MySqlConnection getConnection() {
            return new MySqlConnection();
        }

    }

    public class SqlServerConnection implements DatabaseConnection {
        @Override
        public SqlServerConnection getConnection() {
            return new SqlServerConnection();
        }
    }

    // 2
    public abstract static class CreditCard {
        String holderName;
        String cardNumber;
        static double accountBalance;
        String cardType;

        public CreditCard() {
        }

        abstract boolean isCardAccepted(String cardType);

        public void payBills(double bill) {
            this.accountBalance = this.accountBalance - bill;
        }

        public void payBills(int bill) {
            accountBalance = -(double) bill;
        }

        public static void refund(double bill) {
            accountBalance = accountBalance + bill;
        }
    }

}

public class hw_designPattern {
    public static class AppleDesignerFactory {
        private static AppleDesignerFactory factory;

        private AppleDesignerFactory() {
        }

        public static synchronized AppleDesignerFactory getInstance() {
            if (factory == null) {
                factory = new AppleDesignerFactory();
            }
            return factory;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public interface Currency {
        public Currency exchange();
    }

    public class USDollar implements Currency {
        public USDollar exchange() {
            return new USDollar();
        }
    }

    public class NewTaiwanDollar implements Currency {
        public NewTaiwanDollar exchange() {
            return new NewTaiwanDollar();
        }
    }

    public class CurrencyFactory {
        public Currency getLocalCurrency(String country) {
            if ("US".equalsIgnoreCase(country)) {
                return new USDollar();
            } else if ("TAIWAN".equalsIgnoreCase(country)) {
                return new NewTaiwanDollar();
            }
            return null;
        }
    }

}

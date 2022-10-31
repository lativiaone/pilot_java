public class hw_exception {
    public class CardTypeException extends Exception {
        public CardTypeException(String errorMessage) {
            System.out.println("CardTypeException: " + errorMessage);
        }
    }

    public class AddressException extends Exception {
        public AddressException(String errorMessage) {
            System.out.println("AddressException: " + errorMessage);
        }
    }

    public class ExceptionHandler {
        public void handleException(String a, String b) throws CardTypeException, AddressException {
            if (a.equals("AMEX")) {
                throw new CardTypeException("AMEX card is unavailable");
            } else if (b.equals("outside US")) {
                throw new AddressException("Your address is outside US");
            }
        }

        public void main(String[] args) {
            ExceptionHandler test = new ExceptionHandler();
            try {
                test.handleException("AMEX", "inside US");
            } catch (CardTypeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (AddressException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
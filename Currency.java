public class Currency {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        System.out.println("Choose the currency");

        int currency = in.nextInt();
        System.out.println("Enter the amount");
        double amount = in.nextDouble();
       
        switch (currency) {
            case 1:
                System.out.println("Rupee");
                break;
            case 2:
                System.out.println("Dollar");
                break;
            case 3:
                System.out.println("Euro");
                break;
            default:
                System.out.println("Invalid currency");
        }
      }
    }

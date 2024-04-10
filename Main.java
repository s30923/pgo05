public class Main {
    public static void main(String[] args) {
            User gosc1 = new User("usz@usz.pl");
            User gosc2 = new User("usz2@usz.pl");
            User gosc3 = new User("Uszak", "uchaty", "usz3@usz.pl", "JD100%");
            gosc1.upgradeGuestToUser("susiak", "suzak", "XDDD");
            System.out.println(gosc3.isGuest());

            Product usz1 = new Product(0.5, "uszy", "2137");
            Product usz2 = new Product(0.5, "uszyV2", "420", 420);
            Product usz3 = new Product(0.5, "uszyduzaporcja", "69");
            usz1.setPrice(21.37);
            usz1.setQuantity(5);
            System.out.println(usz1.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new PopupService();
        OrderService service= new OrderService(notification);
        service.placeOrder();
    }
}

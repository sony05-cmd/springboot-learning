public class OrderService {
    private final NotificationService notification;

    public OrderService(NotificationService notification){
        this.notification=notification;
    }
    public void placeOrder(){
        System.out.println("order placed");
        notification.sendNotification();
    }
  
}

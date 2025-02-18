public class Order {
    private int orderId;
    private String customerName;
    private String orderDetails;
    Order next;

    public Order (int orderId, String customerName, String orderDetails){
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDetails = orderDetails;
        this.next = null;
    }

    @Override
    public String toString(){
        return "Order ID : " + orderId + " , Customer: " + customerName + ", Order Details: " +
                orderDetails;
    }
}

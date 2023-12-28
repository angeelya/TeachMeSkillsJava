package work30.home.builder;

import java.math.BigDecimal;

public class Order {
    private String numberOrder;
    private String address;
    private String nameCustomer;
    private BigDecimal cost;

    public static class OrderBuilder {
        private Order order;

        public OrderBuilder() {
            order = new Order();
        }

        public OrderBuilder numberOrder(String numberOrder) {
            order.numberOrder = numberOrder;
            return this;
        }
        public OrderBuilder address(String address)
        {
            order.address=address;
            return this;
        }
        public OrderBuilder nameCustomer(String name)
        {
            order.numberOrder=name;
            return this;
        }
        public OrderBuilder cost(BigDecimal cost)
        {
            order.cost = cost;
            return this;
        }
        public Order build ()
        {
            return order;
        }
    }
}

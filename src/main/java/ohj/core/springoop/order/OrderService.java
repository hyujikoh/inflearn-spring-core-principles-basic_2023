package ohj.core.springoop.order;

/**
 * Author : hyujikoh
 * CreatedAt : 2024-02-21
 * Desc :
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}

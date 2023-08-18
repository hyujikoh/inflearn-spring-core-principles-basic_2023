package ohj.core.springoop.domain.order.service;

import ohj.core.springoop.domain.order.Order;

/**
 * Author : hyujikoh
 * CreatedAt : 2023-08-18
 * Desc : 주문에 대한 규칙 인터페이스
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}

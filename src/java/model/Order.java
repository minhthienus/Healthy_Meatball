package model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order implements Serializable {
    
    private int orderId;
    private String orderDate;
    private String shipDate;
    private String note;
    private int totalPrice;
    private int status;
    private int accId;
    private int shippingId;
    
}

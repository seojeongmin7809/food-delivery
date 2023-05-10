package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private Long orderId;
    private String options;
    private String status;
    private Long storeId;
    private Long customerId;
}

package com.EcommerceProject.Payload;

import lombok.Data;

@Data
public class StripePaymentDTO {
    // stripe need two thing  to create payment intent  amount and currency ( source - stripe documentation)

    private Long amount;
    private String currency;
}

package com.kgitbank.megakgcoffee.Model.DTO.Payment;

public class PaymentDTO {

    private int payment_seq;   // 결제 식별번호
    private int paymentReg_seq;   // 회원 식별번호
    private int paymentReg_sysdate;   // 결제 날짜
    private String paymentReg_style;   //  결제 수단
    private String paymentReg_comment;   //  매장 요청사항


    public PaymentDTO(int paymentReg_sysdate, String paymentReg_style, String paymentReg_comment) {
        this.paymentReg_sysdate = paymentReg_sysdate;
        this.paymentReg_style = paymentReg_style;
        this.paymentReg_comment = paymentReg_comment;

    }

    public static PaymentDTO paymentUser(int paymentReg_sysdate, String paymentReg_style, String paymentReg_comment) {
        return new PaymentDTO(paymentReg_sysdate, paymentReg_style, paymentReg_comment);
    }

    public int getPayment_seq() {
        return payment_seq;
    }

    public int getPaymentReg_sysdate() {
        return paymentReg_sysdate;
    }

    public String getPaymentReg_style() {
        return paymentReg_style;
    }

    public String getPaymentReg_comment() {
        return paymentReg_comment;
    }

}

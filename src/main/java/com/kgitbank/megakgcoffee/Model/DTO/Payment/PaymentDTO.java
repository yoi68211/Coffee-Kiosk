package com.kgitbank.megakgcoffee.Model.DTO.Payment;

public class PaymentDTO {

    private int payment_seq;   // 결제 식별번호
    private int paymentReg_seq;   // 회원 식별번호
    private int paymentReg_sysdate;   // 결제 날짜
    private String paymentReg_style;   //  결제 수단
    private String paymentReg_comment;   //  매장 요청사항
    private String paymentReg_CashReceipts;   //  회원 전화번호


    public PaymentDTO(int paymentReg_sysdate, String paymentReg_style, String paymentReg_comment, String paymentReg_CashReceipts) {
        this.paymentReg_sysdate = paymentReg_sysdate;
        this.paymentReg_style = paymentReg_style;
        this.paymentReg_comment = paymentReg_comment;
        this.paymentReg_CashReceipts = paymentReg_CashReceipts;

    }




    public int getPayment_seq() {
        return payment_seq;
    }

    public void setPayment_seq(int payment_seq) {
        this.payment_seq = payment_seq;
    }

    public int getPaymentReg_seq() {
        return paymentReg_seq;
    }

    public void setPaymentReg_seq(int paymentReg_seq) {
        this.paymentReg_seq = paymentReg_seq;
    }

    public int getPaymentReg_sysdate() {
        return paymentReg_sysdate;
    }

    public void setPaymentReg_sysdate(int paymentReg_sysdate) {
        this.paymentReg_sysdate = paymentReg_sysdate;
    }

    public String getPaymentReg_style() {
        return paymentReg_style;
    }

    public void setPaymentReg_style(String paymentReg_style) {
        this.paymentReg_style = paymentReg_style;
    }

    public String getPaymentReg_comment() {
        return paymentReg_comment;
    }

    public void setPaymentReg_comment(String paymentReg_comment) {
        this.paymentReg_comment = paymentReg_comment;
    }

    public String getPaymentReg_CashReceipts() {
        return paymentReg_CashReceipts;
    }

    public void setPaymentReg_CashReceipts(String paymentReg_CashReceipts) {
        this.paymentReg_CashReceipts = paymentReg_CashReceipts;
    }



}

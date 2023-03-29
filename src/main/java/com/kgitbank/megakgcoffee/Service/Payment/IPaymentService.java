package com.kgitbank.megakgcoffee.Service.Payment;

import com.kgitbank.megakgcoffee.Model.DAO.Payment.PaymentDAO;
import com.kgitbank.megakgcoffee.Model.DAO.Payment.PaymentDAOFactory;
import com.kgitbank.megakgcoffee.Model.DTO.Payment.PaymentDTO;

public class IPaymentService implements PaymentService {
    PaymentDAO paymentDAO = PaymentDAOFactory.getPaymentDAO();

    @Override
    public void payment(int paymentReg_sysdate, String paymentReg_style, String paymentReg_comment) {
        paymentDAO.insert(PaymentDTO.paymentUser(paymentReg_sysdate, paymentReg_style, paymentReg_comment));
    }
}

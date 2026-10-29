package view;

import model.ex4.*;
public class Ex4 {
   public static void main(String[] args) {
        Pagamento pg = new Pagamento();
        PagamentoBoleto pgb = new PagamentoBoleto();
        PagamentoCartao pgc = new PagamentoCartao();
       
        pg.processarPagamento();
        pgb.processarPagamento();
        pgc.processarPagamento();
   } 
}

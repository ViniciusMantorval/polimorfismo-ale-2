package view;

import model.ex3.Produto;
public class Ex3 {
   public static void main(String[] args) {
      Produto prod1 = new Produto("Carlos");
      Produto prod2 = new Produto("Carlos", 12.0);
      Produto prod3 = new Produto("Carlos", 12.0, 3);
      
        System.out.println(prod1);
        System.out.println("");
        System.out.println(prod2);
        System.out.println("");
        System.out.println(prod3);
        System.out.println("");
   } 
}

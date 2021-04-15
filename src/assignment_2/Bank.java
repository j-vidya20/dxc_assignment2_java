package assignment_2;


import java.util.*;

abstract class Bank1

{

   abstract void getBalance();

}

class BankA extends Bank1

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank A is $1000");

   }

}

class BankB extends Bank1

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank B is $1500");

   }

}

class BankC extends Bank1

{

   void getBalance()

   {

       System.out.println("Money deposited in Bank C is $2000");

   }

}

public class Bank

{

public static void main(String[] args)

{

    Bank1 A = new BankA();

    A.getBalance();

    Bank1 B= new BankB();

    B.getBalance();

    Bank1
    C = new BankC();

    C.getBalance();

}

}


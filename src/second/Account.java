//package second;
//
//import java.util.ArrayList;
//import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;
//
//public class Account extends Bank {
//
//
//    public Account(String name, String branch, String ifscode, int accountno) {
//        super(bankname, branch, ifscode);
//       this.accountno = accountno;
//       this.name = name;
//       this.balance = balance;
//
//    }
//    int accountno;
//   String name;
//   Float balance;
//
//   public static void display(Account[] holders){
//        System.out.println("account details");
//        for (Account a:holders){
//                System.out.println(a.accountno+" "+a.balance+" "+a.name);
//        }
//    }
//
//    public  static void display(Account[] holders,int accno){
//        System.out.println("Account details");
//        for (Account a:holders){
//            if (a.accountno==accno)
//                System.out.println(a.accountno+" "+a.balance+" "+a.name);
//       }
//    }
//
//    public  static void deposit(int acno,int amount,Account[] holders){
//
//       for (Account a:holders){
//            if (a.accountno==acno)
//            {
//                a.balance=a.balance+amount;
//                System.out.println("deposited");
//                System.out.println(a.accountno+" "+a.balance+" "+a.name);
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Account acc1=new Account("SBI","skm","11",1001);
//        Account acc2=new Account("sbt","ekm","112",1002);
//
//        display(accounts);
//        display(accounts,1002);
//        deposit(1002,500,accounts);
//    }
//}
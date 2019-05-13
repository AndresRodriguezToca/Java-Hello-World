class BankAccount{
  double balance;
  BankAccount(double balance){
    this.balance = balance;
  }
  //This refers the atribute inside Bank Account
public void deposit(double value){
  balance += value;
}
public void withdraw(double value){
  balance -= value;
}
public double getBalance(){
  return balance;
  }
}

class Main {
  public static void main(String[] args) {
    BankAccount lebron = new BankAccount(300000);
    lebron.withdraw(10000);
    System.out.println(lebron.getBalance());
  }
}
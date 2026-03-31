class Bank{
    int amount;
    Bank(int amount){
        this.amount=amount;
    }
    void Deposite(int value){
        amount+=value;

    }
    void Withdraw(int value){
      if(amount<value){
        System.out.println("Insufficient Balance");
      }else{
        amount-=value;
      }

    }
    void checkBalance(){
        System.out.println("Balance:"+amount);
    }

}

public class Account {
    public static void main(String[] args) {
        Bank b=new Bank(1000);
        b.Deposite(100);
        b.Withdraw(100);
        b.checkBalance();
        
    }
}
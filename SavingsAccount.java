public class SavingsAccount {
    public double saldo;
    public double bunga = 0.01;
    public String name;

    public void displayCustomer(){
        System.out.println("Nasabah   : "+ name);
        System.out.println("Saldo     : "+saldo);
        System.out.println("Bunga     : "+ bunga);
    }
    
    public void deposit(double setor){
        saldo += setor;
        System.out.println("berhasil menyetor : "+ setor +", saldo baru : "+ saldo);
    }

    public void withdraw(double amount) {
        if (amount < 0){
            System.out.println("jumlah penarikan tidak boleh negatif");
        } else if (amount > saldo){
            System.out.println("saldo tidak cukup untuk penarikan");
        } else {
            saldo -= amount;
            System.out.println("berhasil menarik : "+ amount +", saldo baru : "+ saldo);
        }
    }

    public double calcInterest(){
        double interest = saldo * bunga/12;
        return interest;
    }
        
}



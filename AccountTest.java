import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        SavingsAccount sa0001 = new SavingsAccount();
        sa0001.saldo = 1000;
        sa0001.name = "Jane";
        sa0001.bunga = 0.02;
        
        SavingsAccount sa0002 = new SavingsAccount();
        sa0002.saldo = 2000;
        sa0002.name = "Jasmine";
        sa0002.bunga  = 0.015;

        System.out.println("------ Nasabah jane cantik imut ------");
        sa0001.displayCustomer();
        System.out.println("");
        System.out.println("------ Nasabah jasmine gemoi ------");
        sa0002.displayCustomer();

        System.out.println(" ");
        
        System.out.println("------ Transaksi jane ------");
        sa0001.displayCustomer();
        System.out.print("mau setor(1) atau tarik(2)? ");//saya mau nambahkan inputan setor atau tarik buat variasi aja buk :)
        int pilihan1 = input.nextInt();
        if (pilihan1 == 1){
            System.out.print("jumlah setor : ");
            double setor = input.nextDouble();
            sa0001.deposit(setor);
        }else if (pilihan1 == 2){
            System.out.print("jumlah penarikan : ");
            double tarik = input.nextDouble();
            sa0001.withdraw(tarik);
        }else {
            System.out.println("error : masukkan piihan yang benar");
            System.exit(0);
        }
        
        
        sa0001.saldo += sa0001.calcInterest();
        System.out.println("saldo setelah bunga : " + sa0001.saldo);

        System.out.println(" ");
        System.out.println("------ Transaksi jasmine ------");
        sa0002.displayCustomer();
        System.out.print("mau setor(1) atau tarik(2)? ");
        int pilihan2 = input.nextInt();
        if (pilihan2== 1){
            System.out.print("jumlah setor : ");
            int setor = input.nextInt();
            sa0002.deposit(setor);
        }else if (pilihan2 == 2){
            System.out.print("jumlah penarikan : ");
            int tarik = input.nextInt();
            sa0002.withdraw(tarik);
        }else{
            System.out.println("error : masukkan pilihan yang benar");
            System.exit(0);
        }
        
        sa0002.saldo += sa0002.calcInterest();
        System.out.println("saldo setelah bunga : " + sa0002.saldo);


    
}
}


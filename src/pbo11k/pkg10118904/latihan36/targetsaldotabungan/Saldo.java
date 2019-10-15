/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan36.targetsaldotabungan;

/**
 *
 * @author Firman Alfinas
 */
public class Saldo {
    private int saldoAwal;
    private int saldo;
    private double bunga;
    private int targetSaldo;
    private int i;
    
    private int hitungBunga(int parSaldoAwal, double parBunga) {
        return (int) ((int) parSaldoAwal * parBunga);
    }
    
    public void hitungSaldo(int parSaldoAwal, double parBunga, int parTagetSaldo) {
        
        saldoAwal = parSaldoAwal;
        bunga = parBunga;
        saldo = saldoAwal;
        targetSaldo = parTagetSaldo;
        i = 1;
        do {
            saldo = saldo + hitungBunga(saldo, bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp.%,10d%n",saldo);
            i++;
        } while (saldo < targetSaldo);
    }
}
    


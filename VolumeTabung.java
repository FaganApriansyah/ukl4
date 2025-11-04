import java.util.Scanner;

public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();
        double volume = hitungVolumeTabung(jariJari, tinggi);
        System.out.println("Volume tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi + " adalah: " + volume);
        input.close();
    }
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
}

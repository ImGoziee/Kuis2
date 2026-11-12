import java.util.Scanner;

public class Kuis10Gozie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int parkirTerlama = -1;
        int tigaKeatas = 0;

        do {
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
            if (jam < 1 || jam > 24) {
                System.out.println("Input tidak valid.");
            }
        } while (jam < 1 || jam > 24);

        while (jam != 0) {
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);

            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
            jumlahKendaraan++;

            if (jam > parkirTerlama && jam <= 24) {
                parkirTerlama = jam;
            }
            if (jam > 3 && jam <= 24) {
                tigaKeatas++;
            }
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Parkir terlama : " + parkirTerlama + " jam");
        System.out.println("Jumlah kendaraan yang parkir lebih dari 3 jam : " + tigaKeatas);
    }
}

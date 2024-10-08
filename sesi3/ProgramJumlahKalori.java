import java.util.Scanner;

public class ProgramJumlahKalori {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("## Program Menghitung Jumlah Kalori ##");
        System.out.println("======================================");
        System.out.println();

        String nama;
        char jenis_olahraga;
        int durasi_olahraga = 0, kalori_per_menit = 0, jumlah_kalori;

        System.out.print("Nama: ");
        nama = input.nextLine();

        System.out.print("Jenis Olahraga: (A = Lari, B = Push-up, C = Plank) ");
        jenis_olahraga = input.next().charAt(0);

        System.out.print("Durasi olahraga (dalam menit): ");
        durasi_olahraga = input.nextInt();


        System.out.println();

        //tentukan jumlah kalori per jenis olahraga

            switch (jenis_olahraga) {
                case 'A':
                kalori_per_menit = 60 / 5;
                break;

                case 'B':
                kalori_per_menit = 200 / 30;
                break;

                case 'C':
                kalori_per_menit = 5 / 1;
                break;
        }
        jumlah_kalori = durasi_olahraga * kalori_per_menit;

        //proses output
        System.out.println("Selamat " + nama + "!, kamu telah membakar " + jumlah_kalori + " kalori selama " + durasi_olahraga + " menit!");

    }
}

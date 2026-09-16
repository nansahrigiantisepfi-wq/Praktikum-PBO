/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype AMD
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int totalStudents = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer newline

        // Array untuk menyimpan objek Student
        Student[] students = new Student[totalStudents];

        // Langkah 2: Input Data & Looping
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nData siswa ke-" + (i + 1) + ":");
            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();
            
            System.out.print("Masukkan nilai: ");
            double score = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer newline

            // Membuat objek Student dan menyimpannya di array
            students[i] = new Student(name, score);
            
            // Mengecek status kelulusan lewat method checkPassed()
            students[i].checkPassed();

            // Langkah 3 & 4: Tampilkan status per siswa
            String status = students[i].passed ? "Lulus" : "Tidak Lulus";
            System.out.println("Siswa: " + students[i].name + " - Nilai: " + students[i].score + " - " + status);
        }

        // Langkah 4: Hitung rata-rata & rekap kelulusan
        double totalScore = 0;
        int passedCount = 0;
        int failedCount = 0;

        for (int i = 0; i < totalStudents; i++) {
            totalScore += students[i].score;
            if (students[i].passed) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        double averageScore = totalScore / totalStudents;

        // Display Ringkasan Akhir
        System.out.println();
        System.out.printf("Rata-rata nilai kelas: %.2f\n", averageScore);
        System.out.println("Jumlah siswa lulus: " + passedCount);
        System.out.println("Jumlah siswa tidak lulus: " + failedCount);

        scanner.close();
    }
}

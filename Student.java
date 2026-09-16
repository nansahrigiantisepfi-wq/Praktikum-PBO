/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype AMD
 */
// Langkah 1: Buat Kelas Student
public class Student {
    String name;
    double score;
    boolean passed;

    // Constructor untuk mengisi name dan score
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // Method untuk mengecek kelulusan (nilai >= 70 -> passed = true)
    public void checkPassed() {
        if (this.score >= 70) {
            this.passed = true;
        } else {
            this.passed = false;
        }
    }
}

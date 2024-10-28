package tugas6;

import java.util.LinkedList;
import java.util.Queue;

public class nilaiqueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> Nilai = new LinkedList<>();

        String Mahasiswa[] = {"Santi", "Aldi", "Riko", "Rahma", "Koko"};
        int Score[] = {100, 50, 100, 90, 50};

        for(int i = 0; i < Mahasiswa.length; i++){
            queue.add(Mahasiswa[i]);
            Nilai.add(Score[i]);
        }
        System.out.println("Nama Mahasiswa beserta Nilainya");
        System.out.println("-----------------------------------");
        while (!queue.isEmpty() && !Nilai.isEmpty()) {
            System.out.println("Nama Mahasiswa: " + queue.poll() + ", Nilai: " + Nilai.poll() + "\n-----------------------------------");
        }
    }
}

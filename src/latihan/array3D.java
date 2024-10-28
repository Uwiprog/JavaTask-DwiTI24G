package latihan;

public class array3D {
    public static void main(String[] args) {
        String[][][] labkomputer = {
                {
                        { "putra", "Naban", "Reggie", "Dwi", null },
                        { "zaim", "robby", "revan", null, null }
                },
                {
                        { "Abi", "Naufal", "Gdizzan", "Hamudi", "Ibnu" },
                        { "Deni", "Hmaz", "Ade", "Fahrul", "Ananda" }
                },
                {
                        { null, null, "lukman", "Nazril", "Rizki" },
                        { "Alexander", "Asril", "Iqbal", "Hafiz", "Matto" }
                },
                {
                        { "Salwa", "Djibriel", "Esa", "Isti", null },
                        { "Restu", "Rosya", "naura", "zazkia", null }
                }
        };
        for (int i = 0; i < labkomputer.length; i++) {
            System.out.println("Baris" + (i + 1) + ":");
            for (int j = 0; j < labkomputer[i].length; j++) {
                System.out.println("Kelompok" + (j + 1) + ":");
                for (int k = 0; k < labkomputer[i][j].length; k++) {
                    System.out.print(labkomputer[i][j][k] + ",");
                }
                System.out.println();
            }
        }
    }
}

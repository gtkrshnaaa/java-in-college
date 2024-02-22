public class t1_methodJavaSrlainDiPraktik {
    public static void main(String[] args) {
        String sentence = "saya suka makan nasi goreng";

        // Mengubah semua huruf menjadi huruf kapital
        String uppercaseSentence = sentence.toUpperCase();
        System.out.println("Uppercase: " + uppercaseSentence);

        // Mengubah semua huruf menjadi huruf kecil
        String lowercaseSentence = sentence.toLowerCase();
        System.out.println("Lowercase: " + lowercaseSentence);

        // Menghitung jumlah karakter dalam kalimat
        int length = sentence.length();
        System.out.println("Length: " + length);

        // Memeriksa apakah kalimat berisi kata "makan"
        boolean containsMakan = sentence.contains("makan");
        System.out.println("Contains 'makan': " + containsMakan);

        // Mengganti kata "suka" menjadi "tidak suka"
        String replacedSentence = sentence.replace("suka", "tidak suka");
        System.out.println("Replaced: " + replacedSentence);

        // Memisahkan kata-kata dalam kalimat menjadi array
        String[] words = sentence.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Menggabungkan array kata menjadi satu kalimat dengan pemisah "-"
        String joinedSentence = String.join("-", words);
        System.out.println("Joined: " + joinedSentence);

        // Menghapus spasi di awal dan akhir kalimat
        String trimmedSentence = sentence.trim();
        System.out.println("Trimmed: " + trimmedSentence);
    }
}

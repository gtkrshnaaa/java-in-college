public class p2_programTumpukan { 
    public static int N = 5;
    public static int atas = -1;
    public static void push (String tumpukan[], String data) { 
        if (atas == N-1) {
            System.out.println("maap, tumpukan penuh, PUSH " + data + " tidak dapat dilakukan");
        } else { 
            atas = atas + 1;
            tumpukan[atas] = data;
            System.out.println("PUSH " + data + " berhasil..");
        }
    }

    public static String pop (String tumpukan[]) { 
        String hasil;
        if (atas < 0 ) { 
            hasil = "TUMPUKAN KOSONG, POP GAGAL DILAKUKAN";
        }
        else { 
            hasil = tumpukan[atas];
            atas = atas - 1;
        }
        return (hasil);
    }

    public static void bacaTumpukan(String tumpukan[]) { 
        System.out.println("");
        System.out.println("--TUMPUKAN:-");
        for (int i=atas; i>=0; i--) { 
            System.out.println(tumpukan[i]);
        }
        System.out.println("--akhir tumpukan-");
        System.out.println("");
    }

    public static void main (String[] args) { 
        String tumpukan[] = new String[10];
        push (tumpukan, "Buku A");
        push (tumpukan, "Buku B");
        push (tumpukan, "Buku C");
        push (tumpukan, "Buku D");
        bacaTumpukan(tumpukan);
        push (tumpukan, "Buku E");
        push (tumpukan, "Buku F");
        push (tumpukan, "Buku G");
        bacaTumpukan(tumpukan);

    }
}

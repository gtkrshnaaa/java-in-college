public class l1_arrayMultidimensi {


    public static void main( String []args) {

        String entry[][][] =
        {
            {
                {"vianslezer","100411052","Surabaya"},
                {"Echa","100411025","Jakarta"},
                {"Masayu","100411024","Malang"}
            }
        };

        System.out.println("Nama: "+entry[0][0][0]);
        System.out.println("Nim: "+entry[0][0][1]);
        System.out.println("Alamat : "+entry[0][0][2]);


        System.out.println("-------------------------");

        System.out.println("Nama: "+entry[0][1][0]);
        System.out.println("Nim: "+entry[0][1][1]);
        System.out.println("Alamat : "+entry[0][1][2]);


        System.out.println("-------------------------");

        System.out.println("Nama: "+entry[0][2][0]);
        System.out.println("Nim: "+entry[0][2][1]);
        System.out.println("Alamat : "+entry[0][2][2]);
 
        System.out.println("-------------------------");

    }

}

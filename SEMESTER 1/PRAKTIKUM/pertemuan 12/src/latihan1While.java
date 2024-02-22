public class latihan1While {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};
        int x = 0;
        while (x <= numbers.length){
            if (numbers [x] == 30)
                break;
                
            
            System.out.print(numbers[x]);
            System.out.print("\n");
            x++;
        }
    }
}





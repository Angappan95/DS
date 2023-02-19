import javax.sound.midi.Soundbank;

public class CheckPowerOf2 {
    public static boolean isPowerOf2(int n){
        int counter = 0;
        while(counter <= 32){
            int temp = (int)Math.pow(2, counter);
            if(temp > n) return false;
            else if(temp == n) return true;
            counter++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(8));
        System.out.println(isPowerOf2(12));
        System.out.println(isPowerOf2(1024));
        System.out.println(isPowerOf2(2));
        System.out.println(isPowerOf2(1));
    }
}

import java.io.UnsupportedEncodingException;

public class GetBytesFromSymbol {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "Ы";
        byte [] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int) b[i] ^ -1 << 8) + " ");
        }
    }
}

package PokemonGame;

/**
 * Helpful stuff
 *
 * @author jmurphy61
 * @version 1.0
 *
 */
public class Utils{
    public static byte b(int integer) {
        return (byte) integer;
    }

    public static byte[] bArr(int[] integerArray) {
        byte[] out = new byte[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            out[i] = b(integerArray[i]);
        }
        return out;
    }
}

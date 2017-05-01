package org.openbitset;

/**
 * Created by rajat.kumar1 on 01/05/17.
 */
public class Test {

    public static void main(String[] args) {

        /*ShortBitSet shortBitSet = new ShortBitSet();
        shortBitSet.set(1, true);
        shortBitSet.set(2, false);
        for (int i = 0; i < 16; i++) {
            System.out.println(shortBitSet.get(i));
        }*/

        /*IntBitSet intBitSet = new IntBitSet();
        intBitSet.set(1, true);
        intBitSet.set(31, true);
        for (int i = 0; i < 32; i++) {
            System.out.println(intBitSet.get(i));
        }*/

        ByteBitSet byteBitSet = new ByteBitSet();
        byteBitSet.set(1, true);
        byteBitSet.set(7, true);
        for (int i = 0; i < 8; i++) {
            System.out.println(byteBitSet.get(i));
        }

    }
}

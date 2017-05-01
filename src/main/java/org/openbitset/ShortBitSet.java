package org.openbitset;

/**
 * Created by rajatkumarraghuvanshi@gmail.com on 01/05/17.
 */

/** Short BitSet is focused on memory efficiency for storing
 * up to 16 boolean in 16-bit of short primitive
 * */
public class ShortBitSet {

    short bits = 0;

    public void set(int index, boolean value) {
        if (index > 15)
            throw new IllegalArgumentException("Position can not be greater than 15.");
        if (get(index))
            bits = (short) (bits & (value ? 1 << index : 0 << index));
        bits = (short) (bits | (value ? 1 << index : 0 << index));
    }

    public boolean get(int index) {
        if (index > 15)
            throw new IllegalArgumentException("Position can not be greater than 15.");

        short bitsLocal = bits;
        for (int i = 0; i < 16; i++) {
            if (index == i) continue;
            bitsLocal = (short) (bitsLocal & 1 << index);
        }
        return (bitsLocal & 1 << index) != 0;
    }

}
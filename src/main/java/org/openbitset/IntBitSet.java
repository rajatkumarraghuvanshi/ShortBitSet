package org.openbitset;

/**
 * Created by rajatkumarraghuvanshi@gmail.com on 01/05/17.
 */

/* Stores up to 32 booleans */

public class IntBitSet {

    int bits = 0;

    public void set(int index, boolean value) {
        if (index > 31)
            throw new IllegalArgumentException("Position can not be greater than 31.");
        if (get(index))
            bits = (short) (bits & (value ? 1 << index : 0 << index));
        bits = (bits | (value ? 1 << index : 0 << index));
    }

    public boolean get(int index) {
        if (index > 31)
            throw new IllegalArgumentException("Position can not be greater than 31.");

        int bitsLocal = bits;
        for (int i = 0; i < 32; i++) {
            if (index == i) continue;
            bitsLocal = (bitsLocal & 1 << index);
        }
        return (bitsLocal & 1 << index) != 0;
    }

}

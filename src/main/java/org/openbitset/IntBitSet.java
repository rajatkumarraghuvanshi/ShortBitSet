package org.openbitset;

/**
 * Created by rajatkumarraghuvanshi@gmail.com on 01/05/17.
 */

/* Stores up to 32 booleans */

public class IntBitSet {

    int bits = 0;

    public void set(int bitIndex, boolean value) {
        if (bitIndex > 31)
            throw new IllegalArgumentException("Position can not be greater than 31.");
        if (get(bitIndex))
            bits = (short) (bits & (value ? 1 << bitIndex : 0 << bitIndex));
        bits = (bits | (value ? 1 << bitIndex : 0 << bitIndex));
    }

    public boolean get(int bitIndex) {
        if (bitIndex > 31)
            throw new IllegalArgumentException("Position can not be greater than 31.");

        int bitsLocal = bits;
        for (int i = 0; i < 32; i++) {
            if (bitIndex == i) continue;
            bitsLocal = (bitsLocal & 1 << bitIndex);
        }
        return (bitsLocal & 1 << bitIndex) != 0;
    }

}

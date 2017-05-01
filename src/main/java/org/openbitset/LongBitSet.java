package org.openbitset;

/**
 * Created by rajatkumarraghuvanshi@gmail.com on 01/05/17.
 */

/**
 * Stores up to 64-booleans
 **/
public class LongBitSet {

    long bits = 0;

    public void set(int bitIndex, boolean value) {
        if (bitIndex > 15)
            throw new IllegalArgumentException("Position can not be greater than 15.");
        if (get(bitIndex))
            bits = (short) (bits & (value ? 1 << bitIndex : 0 << bitIndex));
        bits = (bits | (value ? 1 << bitIndex : 0 << bitIndex));
    }

    public boolean get(int bitIndex) {
        if (bitIndex > 15)
            throw new IllegalArgumentException("Position can not be greater than 15.");

        long bitsLocal = bits;
        for (int i = 0; i < 16; i++) {
            if (bitIndex == i) continue;
            bitsLocal = (bitsLocal & 1 << bitIndex);
        }
        return (bitsLocal & 1 << bitIndex) != 0;
    }

}

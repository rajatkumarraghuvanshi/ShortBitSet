package org.openbitset;

/**
 * Created by rajat.kumar1 on 01/05/17.
 */
public class LongBitSet {

    int[] intBits = new int[2];

    public void set(int index, boolean value) {
        if (index > 63)
            throw new IllegalArgumentException("Position can not be greater than 63.");

        int bits = intBits[index>31? 1:0];
        if (get(index))
            bits = (bits & (value ? 1 << index : 0 << index));
        intBits[index>31? 1:0] = (bits | (value ? 1 << index : 0 << index));
    }

    public boolean get(int index) {
        if (index > 63)
            throw new IllegalArgumentException("Position can not be greater than 63.");

        int bitsLocal = intBits[index>31? 1:0];
        for (int i = 0; i < 32; i++) {
            if (index == i) continue;
            bitsLocal = (bitsLocal & 1 << index);
        }
        return (bitsLocal & 1 << index) != 0;
    }

}

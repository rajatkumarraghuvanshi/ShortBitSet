package org.openbitset;

/**
 * Created by rajatkumarraghuvanshi@gmail.com on 01/05/17.
 */
public class ByteBitSet {

    byte bits = 0;

    public void set(int index, boolean value) {
        if (index > 7)
            throw new IllegalArgumentException("Position can not be greater than 7.");
        if (get(index))
            bits = (byte) (bits & (value ? 1 << index : 0 << index));
        bits = (byte) (bits | (value ? 1 << index : 0 << index));
    }

    public boolean get(int index) {
        if (index > 7)
            throw new IllegalArgumentException("Position can not be greater than 7.");

        byte bitsLocal = bits;
        for (int i = 0; i < 8; i++) {
            if (index == i) continue;
            bitsLocal = (byte) (bitsLocal & 1 << index);
        }
        return (bitsLocal & 1 << index) != 0;
    }

}

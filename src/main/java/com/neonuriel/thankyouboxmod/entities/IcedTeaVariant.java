package com.neonuriel.thankyouboxmod.entities;

import java.util.Arrays;
import java.util.Comparator;

public enum IcedTeaVariant {
    DEFAULT(0),
    ORCHID(1);

    private static final IcedTeaVariant[] BY_ID = Arrays.stream(values())
            .sorted(Comparator.comparingInt(IcedTeaVariant::getId)).toArray(IcedTeaVariant[]::new);
    private final int id;

    IcedTeaVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static IcedTeaVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
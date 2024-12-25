package com.neonuriel.thankyouboxmod.entities;

import java.util.Arrays;
import java.util.Comparator;

public enum InfpVariant {
    DEFAULT(0),
    ORCHID(1);

    private static final InfpVariant[] BY_ID = Arrays.stream(values())
            .sorted(Comparator.comparingInt(InfpVariant::getId)).toArray(InfpVariant[]::new);
    private final int id;

    InfpVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static InfpVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
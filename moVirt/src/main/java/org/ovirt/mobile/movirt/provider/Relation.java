package org.ovirt.mobile.movirt.provider;

public enum Relation {

    IS_EQUAL(" = "),
    NOT_EQUAL(" <> "),
    IS_LIKE(" LIKE "),
    IN(" IN "),
    LESS_THAN(" < "),
    LARGER_THAN(" > ");

    private final String val;

    Relation(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}

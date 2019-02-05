package com.codecool.plaza.api;

public abstract class Product {

    protected long barcode;
    protected String name;
    protected String manufacturer;

    protected Product(long barcode, String name, String manufacturer) {

    }

    public long getBarcode() {
        return this.barcode;
    }

    public String getName() {
        return this.name;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

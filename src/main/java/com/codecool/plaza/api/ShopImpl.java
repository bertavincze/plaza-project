package com.codecool.plaza.api;

import java.util.List;
import java.util.Map;

public class ShopImpl implements Shop {

    private String name;
    private String owner;
    private Map<Long, ShopEntryImpl> products;

    public ShopImpl(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public List<Product> getProducts() throws ShopIsClosedException {
        return null;
    }

    @Override
    public Product findByName(String name) throws NoSuchProductException, ShopIsClosedException {
        return null;
    }

    @Override
    public float getPrice(long barcode) throws NoSuchProductException, ShopIsClosedException {
        return 0;
    }

    @Override
    public boolean hasProduct(long barcode) throws ShopIsClosedException {
        return false;
    }

    @Override
    public void addNewProduct(Product product, int quantity, float price) throws ProductAlreadyExistsException, ShopIsClosedException {

    }

    @Override
    public void addProduct(long barcode, int quantity) throws NoSuchProductException, ShopIsClosedException {

    }

    @Override
    public Product buyProduct(long barcode) throws NoSuchProductException, OutOfStockException, ShopIsClosedException {
        return null;
    }

    @Override
    public List<Product> buyProducts(long barcode, int quantity) throws NoSuchProductException, OutOfStockException, ShopIsClosedException {
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private class ShopEntryImpl {

        private Product product;
        private int quantity;
        private float price;

        private ShopEntryImpl(Product product, int quantity, float price) {
            this.product = product;
            this.quantity = quantity;
            this.price = price;
        }


        public Product getProduct() {
            return this.product;
        }


        public void setProduct(Product product) {
            this.product = product;
        }


        public int getQuantity() {
            return this.quantity;
        }


        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }


        public void increaseQuantity(int amount) {
            this.quantity += amount;
        }


        public void decreaseQuantity(int amount) {
            this.quantity -= amount;
        }


        public float getPrice() {
            return this.price;
        }


        public void setPrice(int price) {
            this.price = price;
        }
    }
}

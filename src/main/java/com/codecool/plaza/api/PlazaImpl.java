package com.codecool.plaza.api;

import java.util.ArrayList;
import java.util.List;

public class PlazaImpl implements Plaza {

    private List<Shop> shops = new ArrayList<>();
    private boolean isOpen;

    public PlazaImpl() {

    }

    @Override
    public List<Shop> getShops() throws PlazaIsClosedException {
        if (isOpen) {
            return shops;
        }
        else {
            throw new PlazaIsClosedException();
        }

    }

    @Override
    public void addShop(Shop shop) throws ShopAlreadyExistsException, PlazaIsClosedException {
        if (isOpen) {
            if (!shops.contains(shop)) {
                shops.add(shop);
            }
            else {
                throw new ShopAlreadyExistsException();
            }
        } else {
            throw new PlazaIsClosedException();
        }
    }

    @Override
    public void removeShop(Shop shop) throws NoSuchShopException, PlazaIsClosedException {
        if (isOpen) {
            if (shops.contains(shop)) {
                shops.remove(shop);
            }
            else {
                throw new NoSuchShopException();
            }
        }
        else {
            throw new PlazaIsClosedException();
        }
    }

    @Override
    public Shop findShopByName(String name) throws NoSuchShopException, PlazaIsClosedException {
        if (isOpen) {
            for (Shop shop : shops) {
                if (shop.getName().equals(name)) {
                    return shop;
                } else {
                    throw new NoSuchShopException();
                }

            }
        } else {
            throw new PlazaIsClosedException();
        }
        return null;
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void open() {
        this.isOpen = true;
    }

    @Override
    public void close() {
        this.isOpen = false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

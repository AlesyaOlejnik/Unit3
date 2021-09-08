package com.company.unit12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private List<Product> productList;

    public Shop() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        int productId = product.getId();

        boolean isPresent = productList.stream()
                .map(Product::getId) //Stream<Integer>
                .anyMatch(id -> id == productId); // Один любой Integer из Потока мы присваиваем его значение в id

        if (!isPresent) {
            productList.add(product);
        }
    }

    public void addProducts(Product... products) {
        Arrays.asList(products).forEach(this::addProduct);
    }

    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    public void editProduct(Product product) {
        int productId = product.getId();
        productList.stream()
                .filter(pr -> pr.getId() == productId)
                .forEach(pr -> {
                    pr.setName(product.getName());
                    pr.setPrice(product.getPrice());
                });
    }

}

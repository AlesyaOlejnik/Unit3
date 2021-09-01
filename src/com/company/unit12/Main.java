package com.company.unit12;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Product apple = new Product(1, "яблоко", 200, LocalDate.of(2021,9,1));
        Product bread = new Product(2, "хлеб", 100, LocalDate.of(2021,8,25));
        Product beer = new Product(3, "пиво", 300,LocalDate.of(2020,12,31));

        shop.addProducts(apple,bread,beer);

        List<Product> productList = shop.getProductList();
        ProductPriceComparator productPriceComparator = new ProductPriceComparator();
        productList.sort(productPriceComparator);
        System.out.println(productList);

        shop.deleteProduct(3);

        List<Product> shopProductList = shop.getProductList();
        ProductDateComparator productDateComparator = new ProductDateComparator();
        shopProductList.sort(productDateComparator);
        System.out.println(shopProductList);

        shop.editProduct(new Product(2,"телевизор",10000, LocalDate.of(2019,3,21)));
        System.out.println(productList);

    }
    static class ProductPriceComparator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
           return o1.getPrice() - o2.getPrice();
        }
    }

    static class ProductDateComparator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            return o2.getDate().compareTo(o1.getDate());
        }
    }
}

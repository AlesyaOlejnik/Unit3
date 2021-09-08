package com.company.unit12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    private Shop shop = new Shop();

    public void start() {
        readProductListFromFile();
        Scanner scanner = new Scanner(System.in);
        int userChoose = -1;

        while (userChoose != 0) {
            showStartInfo();

            validIntValue(scanner);

            userChoose = scanner.nextInt();

            switch (userChoose) {
                case 1: {
                    displayProductList();
                    break;
                }
                case 2: {
                    addProduct();
                    break;
                }
                case 3: {
                    editProduct();
                    break;
                }
                case 4: {
                    deleteProduct();
                    break;
                }
                case 0: {
                    writeProductListToFile();
                    return;
                }
                default: {
                    System.out.println("Такой команды не существует.");
                }
            }
        }
    }

    private void writeProductListToFile() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\company\\unit12\\file.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(shop.getProductList());
        } catch (Exception ex) {
            System.out.println("Возникли проблемы при записи в файл");
        }
    }

    private void readProductListFromFile() {
        try (FileInputStream fileInputStream = new FileInputStream("src\\com\\company\\unit12\\file.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            List<Product> products = (List<Product>) objectInputStream.readObject();
            shop.setProductList(products);
        } catch (Exception ex) {
            System.out.println("Возникли проблемы при чтении из файла");
        }
    }


    private void validIntValue(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не целое число, введите число");
            scanner.next();
        }
    }

    private void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id товара");
        validIntValue(scanner);
        shop.deleteProduct(scanner.nextInt());
    }

    private void addProduct() {
        Product product = getProduct();
        shop.addProduct(product);
    }

    private void editProduct() {
        Product product = getProduct();
        shop.editProduct(product);

    }

    private void displayProductList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вывести товары:");
        System.out.println("1. Отсортированные по цене(возрастание)");
        System.out.println("2. Отсортированнные по цене(убывание)");
        System.out.println("3. Отсортированные по дате добавления(сначала новые,потом более старые");
        System.out.println("4. Отфильтрованных по цене, у которых цена находится между двумя границами ( нижней и верхней)");
        validIntValue(scanner);
        int userChoose = scanner.nextInt();
        List<Product> shopProductList = shop.getProductList();
        switch (userChoose) {
            case 1: {
                shopProductList.sort((Comparator.comparingInt(Product::getPrice)));
                break;
            }
            case 2: {
                shopProductList.sort(Comparator.comparingInt(Product::getPrice).reversed());
                break;
            }
            case 3: {
                shopProductList.sort(Comparator.comparing(Product::getDate).reversed());
                break;
            }
            case 4: {
                shopProductList = getProductListFilteredByPrice(scanner, shopProductList);
                break;
            }
        }
        System.out.println(shopProductList);
    }

    private List<Product> getProductListFilteredByPrice(Scanner scanner, List<Product> shopProductList) {
        System.out.println("Введите верхнюю границу");
        validIntValue(scanner);
        int max = scanner.nextInt();
        System.out.println("Введите нижнюю границу");
        validIntValue(scanner);
        int min = scanner.nextInt();

        return shopProductList.stream()
                .filter(product -> product.getPrice() < max && product.getPrice() > min)
                .collect(Collectors.toList());
    }

    private Product getProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id");
        validIntValue(scanner);
        int id = scanner.nextInt();
        System.out.println("Введите название");
        String name = scanner.next();
        System.out.println("Введите цену");
        validIntValue(scanner);
        int price = scanner.nextInt();

        return new Product(id, name, price, LocalDateTime.now());
    }

    private void showStartInfo() {
        System.out.println("Введите номер команды");
        System.out.println("1. Вывод всех товаров");
        System.out.println("2. Добавление товара");
        System.out.println("3. Редактирование товара");
        System.out.println("4. Удаление товара");
        System.out.println("0. Выйти из программы");
    }
}

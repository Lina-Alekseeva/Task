package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Acceptor[] acceptors = new Acceptor[50];
        Product[] products = new Product[50];
        int i = 0, j = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        int k;
      String command;
        while (true) {
            command = scanner.nextLine( );
            switch (command) {
                case "Создать товар":
                    if (i > 49) {
                        System.out.println("Мест для товаров больше нет");
                        continue;
                    } else {
                        System.out.println("Введите название продукта");
                        String NameProduct = scanner.nextLine( );
                        System.out.println("Введите страну получателя");
                        String RecipientCountry = scanner.nextLine( );
                        System.out.println("Введите страну отправителя");
                        String SenderCountry = scanner.nextLine( );
                        System.out.println("Введите вес продукта");
                        scanner.nextDouble( );
                        double Weight = scanner.nextDouble( );
                        scanner.nextLine( );
                        System.out.println("Введите штрихкод продукта");
                        scanner.nextDouble( );
                        double Barcode = scanner.nextDouble( );
                        Product product = new Product(NameProduct,RecipientCountry,SenderCountry,Weight,Barcode);
                        products[i] = product;
                        i++;
                    }
                    break;
                case "Создать приёмщика продукта":
                    if (j > 49) {
                        System.out.println("Мест для приёмщиков больше нет");
                        continue;
                    } else {
                        System.out.println("Введите ФИО приёмщика");
                        String fio = scanner.nextLine( );
                        System.out.println("Введите адрес приёмного пункта");
                        String address = scanner.nextLine( );
                        System.out.println("Введите ФИО руководителя группы");
                        String fioSupervisor = scanner.nextLine( );
                        System.out.println("Введите номер группы");
                        scanner.nextDouble( );
                        double GroupNumber = scanner.nextDouble( );
                        scanner.nextLine( );
                        System.out.println("Введите стаж работы");
                        scanner.nextDouble( );
                        Acceptor acceptor = new Acceptor(fio,address,fioSupervisor,GroupNumber);
                        acceptors[j] = acceptor;
                        j++;
                    }
                    break;

                case "Вывести информацию о товаре":
                    System.out.println("Введите номер товара до " + (i - 1));
                    k = scanner.nextInt( );
                    if (k > i - 1) {
                        System.out.println("Неверный номер");
                        continue;
                    }
                    System.out.println(products[k].getInfo( ));
                    break;

                case "Вывести информацию о приёмщике":
                    System.out.println("Введите номер приёмщика до " + (j - 1));
                    k = scanner.nextInt( );
                    if (k > j - 1) {
                        System.out.println("Неверный номер");
                        continue;
                    }
                    System.out.println(acceptors[k].getInfo( ));
                    break;
            }
        }
    }
}




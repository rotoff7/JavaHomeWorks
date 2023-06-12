package HomeWork6;

import java.util.*;

public class LapTopsMain {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(Brand.SUSA, LapColor.BLACK, new Price(), new LapConfiguration());
        Laptop laptop2 = new Laptop(Brand.SUSA, LapColor.WHITE, new Price(), new LapConfiguration());
        Laptop laptop3 = new Laptop(Brand.SUSA, LapColor.WHITE, new Price(), new LapConfiguration());
        Laptop laptop4 = new Laptop(Brand.ISM, LapColor.BLACK, new Price(), new LapConfiguration());
        Laptop laptop5 = new Laptop(Brand.ISM, LapColor.BLACK, new Price(), new LapConfiguration());
        Laptop laptop6 = new Laptop(Brand.ISM, LapColor.BLUE, new Price(), new LapConfiguration());
        Laptop laptop7 = new Laptop(Brand.ISM, LapColor.BLUE, new Price(), new LapConfiguration());
        Laptop laptop8 = new Laptop(Brand.PH, LapColor.BLACK, new Price(), new LapConfiguration());
        Laptop laptop9 = new Laptop(Brand.PH, LapColor.BLACK, new Price(), new LapConfiguration());
        Laptop laptop10 = new Laptop(Brand.PH, LapColor.WHITE, new Price(), new LapConfiguration());
        Laptop laptop11 = new Laptop(Brand.PH, LapColor.RED, new Price(), new LapConfiguration());

        Set<Laptop> laptopList = new HashSet<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);
        laptopList.add(laptop6);
        laptopList.add(laptop7);
        laptopList.add(laptop8);
        laptopList.add(laptop9);
        laptopList.add(laptop10);
        laptopList.add(laptop11);


        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Вывести все ноутбуки");
        criteria.put(2, "Бренд");
        criteria.put(3, "Цвет");

        Map<Integer, Brand> brands = new HashMap<>();
        int counter = 1;
        for (Brand br : Brand.values()) {
            brands.put(counter++, br);
        }

        Map<Integer, LapColor> allColors = new HashMap<>();
        counter = 1;
        for (LapColor cl : LapColor.values()) {
            allColors.put(counter++, cl);
        }



        System.out.println("Перед вами меню покупки ноутбуков.\nВы можете выбрать наиболее подходящий ноутбук " +
                "воспользовавшись фильтрацией по необходимому критерию, введя соотетствующую цифру:");
        System.out.println(criteria);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер критерия: ");
        int userCriteria = scanner.nextInt();
        switch (userCriteria) {
            case 1 -> {
                System.out.println("Вот список всех имеющихся ноутбуков: \n");
                for (Laptop model : laptopList) {
                    System.out.println(model);
                }
            }
            case 2 -> {
                System.out.println("Модель какого бренда вас интересует?\nВведите соответсующий цифру:");
                System.out.println(brands);
                int userBrand = scanner.nextInt();
                switch (userBrand) {
                    case 1 -> {
                        for (Laptop model : laptopList) {
                            if (model.getBrand() == Brand.ISM) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (Laptop model : laptopList) {
                            if (model.getBrand() == Brand.SUSA) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 3 -> {
                        for (Laptop model : laptopList) {
                            if (model.getBrand() == Brand.PH) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Введен некорректный номер критерия.");
                }
            }
            case 3 -> {
                System.out.println("Модель какого цвета вас интересует?\nВведите соответсующий цифру:");
                System.out.println(allColors);
                int userColor = scanner.nextInt();
                switch (userColor) {
                    case 1 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == LapColor.BLACK) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == LapColor.WHITE) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 3 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == LapColor.RED) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 4 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == LapColor.BLUE) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Введен некорректный номер критерия.");
                }
            }
            default -> System.out.println("Введен некорректный номер критерия.");
        }
    }
}

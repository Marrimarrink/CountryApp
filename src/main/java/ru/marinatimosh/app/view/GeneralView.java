package ru.marinatimosh.app.view;

import ru.marinatimosh.app.controller.ActionController;
import ru.marinatimosh.app.repository.Repository;

import java.util.Scanner;

public class GeneralView {
    private final ActionController actionController = ActionController.getInstance();
  /*  public static void init(){
        actionController.createCitizen(800);
    }*/

    public void activateMainView() {
        final Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Это приложение про Государство - " + actionController.getCountryName()
                    + ", выберите интересующую вас информацию:");
            System.out.println(" ");
            System.out.println("1. Вывести название столицы");
            System.out.println("2. Вывести количество областей");
            System.out.println("3. Вывести количество районов");
            System.out.println("4. Вывести количество городов");
            System.out.println("5. Вывести площадь государства");
            System.out.println("6. Вывести информацию о количестве населения в государстве");
            System.out.println("7. Вывести список граждан, начинающихся на букву __");
            System.out.println("8. Выход");
            System.out.println(" ");
            System.out.println("Введите номер пункта:");

            num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Столица: " + actionController.getCapital());
                    break;
                case 2:
                    System.out.println("Количество областей: " + actionController.getRegions().size()); //  country.getRegionCount()
                    break;
                case 3:
                    System.out.println("Количество районов: " + actionController.getDistricts().size()); // нужно добавить getDistrictCount()
                    break;
                case 4:
                    System.out.println("Количество городов: " + actionController.getCities().size()); //тут ошибка
                    break;
                case 5:
                    System.out.println("Площадь государства: " + actionController.getCountryArea()); //
                    break;
                case 6:
                    // int citizensAmount = actionController.getCitizensAmount();
                    System.out.println("Количество граждан: ");
                    //  float averageAge = actionController.countAverageCitizenAge();
                    System.out.println("Средний возраст населения: ");
                    break;
                case 7:
                    System.out.println("Введите букву для поиска граждан:");
                    String letter = scanner.next();
                    // не забыть добавить в логику поиск по букве + сортировка
                    break;
                case 8:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Такого пункта нет в программе");
            }
        } while (num != 8);

        scanner.close();
    }

}

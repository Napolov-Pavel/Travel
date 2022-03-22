import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PlaceOfInterest> list = fillList();
        Collections.sort(list, Collections.reverseOrder());
        List<PlaceOfInterest> tour = optimalTour(list, 48, 16);
        System.out.println("Оптимальный маршрут осмотра достопримечательностей:");
        tour.forEach(System.out::println);
    }

    private static List<PlaceOfInterest> optimalTour(List<PlaceOfInterest> list, int visitTime, int sleepTime) {
        List<PlaceOfInterest> result = new ArrayList<>();
        double countTime = visitTime - sleepTime;
        for (PlaceOfInterest place : list) {
            if ((countTime - place.getTime()) >= 0) {
                result.add(place);
                countTime -= place.getTime();
            }
        }
        return result;
    }

    static List<PlaceOfInterest> fillList() {
        List<PlaceOfInterest> list = new ArrayList<>();
        list.add(new PlaceOfInterest("Исаакиевский собор", 5, 10));
        list.add(new PlaceOfInterest("Эрмитаж", 8, 11));
        list.add(new PlaceOfInterest("Кунсткамера", 3.5, 4));
        list.add(new PlaceOfInterest("Петропавловская крепость", 10, 7));
        list.add(new PlaceOfInterest("Ленинградский зоопарк", 9, 15));
        list.add(new PlaceOfInterest("Медный всадник", 1, 17));
        list.add(new PlaceOfInterest("Казанский собор", 4, 3));
        list.add(new PlaceOfInterest("Спас на Крови", 2, 9));
        list.add(new PlaceOfInterest("Зимний дворец Петра I", 7, 12));
        list.add(new PlaceOfInterest("Зоологический музей", 5.5, 6));
        list.add(new PlaceOfInterest("Музей обороны и блокады Ленинграда", 2, 19));
        list.add(new PlaceOfInterest("Русский музей", 5, 8));
        list.add(new PlaceOfInterest("Навестить друзей", 12, 20));
        list.add(new PlaceOfInterest("Музей восковых фигур", 2, 13));
        list.add(new PlaceOfInterest("Литературно-мемориальный музей Ф.М. Достоевского", 4, 2));
        list.add(new PlaceOfInterest("Екатерининский дворец", 1.5, 5));
        list.add(new PlaceOfInterest("Петербургский музей кукол", 1, 14));
        list.add(new PlaceOfInterest("Музей микроминиатюры «Русский Левша»", 3, 18));
        list.add(new PlaceOfInterest("Всероссийский музей А.С. Пушкина и филиалы", 6, 1));
        list.add(new PlaceOfInterest("Музей современного искусства Эрарта", 7, 16));
        return list;
    }

}


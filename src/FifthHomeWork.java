public class FifthHomeWork {    public static void main(String[] args) {
    Colleague firstcolleague = new Colleague("Филиппов Алексей Владимирович", "Тестеровщик", "first@gmail.com", 883554382123L, 90000, 21);
    Colleague secondtcolleague = new Colleague("Иванов Максим Львович", "Дизайнер", "second@gmail.com", 883554334123L, 90000, 44);
    Colleague thirdcolleague = new Colleague("Климов Роман Артёмович", "Бекэнд разработчик", "third@gmail.com", 883554387323L, 200000, 26);
    Colleague fourthcolleague = new Colleague("Курочкин Тимур Андреевич", "Фронтэнд разработчик", "fourth@gmail.com", 883554347823L, 120000, 47);
    Colleague fifthcolleague = new Colleague("Попова Милана Григорьевна", "Бухгалтер", "fifth@gmail.com", 883554674509L, 90000, 55);
    Colleague sixthcolleague = new Colleague("Никифоров Константин Андреевич", "Секретарь", "sixth@gmail.com", 883554382123L, 35000, 19);
    Colleague seventhcolleague = new Colleague("Дорохов Григорий Платонович", "Генеральный дирректор", "seventh@gmail.com", 883554312332L, 2000000, 42);
    firstcolleague.info();
    secondtcolleague.info();
    thirdcolleague.info();
    fourthcolleague.info();
    fifthcolleague.info();
    sixthcolleague.info();
    seventhcolleague.info();
    Colleague[] colleaguesArray = new Colleague[7];
    colleaguesArray[0] = firstcolleague;
    colleaguesArray[1] = secondtcolleague;
    colleaguesArray[2] = thirdcolleague;
    colleaguesArray[3] = fourthcolleague;
    colleaguesArray[4] = fifthcolleague;
    colleaguesArray[5] = sixthcolleague;
    colleaguesArray[6] = seventhcolleague;
    System.out.println();
    overForty(colleaguesArray);
}

    public static void overForty(Colleague[] colleaguesArray) {
        for (Colleague colleague : colleaguesArray) {
            if (colleague.age > 40) {
                colleague.info();
            }
        }
    }
}

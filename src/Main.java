public class Main {
    public static void main(String[] args) {
    // Вычисляем количество сотрудников в компании
    var hoursInTotal = 640;
    var hoursDays = 8;
    var employee = hoursInTotal / hoursDays;
    System.out.println( " Всего работников в компании " + employee + " человек. ");
    // Вычисляем количество часов, если число работников увеличится не 94
        employee = employee + 94;
        var hoursInTotal2 = employee * hoursDays;
        System.out.println( " Если в компании работает " + employee + " человек, то всего " + hoursInTotal2 + " часов работы может быть поделено между сотрудниками ");
    }
}
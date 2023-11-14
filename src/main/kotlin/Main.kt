import kotlin.random.Random

fun main() {
    val cities = listOf("Барнаул", "Бийск", "Москва", "Санкт-Петербург", "Гудермес", "Котлас", "Далматово", "Новохоперск", "Красное Село")
    val random = Random(System.currentTimeMillis())

    while (true){
        println("Шаг 1 - Создать направление")
        val startCity = cities[random.nextInt(cities.size)]
        var endCity = cities[random.nextInt(cities.size)]
        endCity = cities[random.nextInt(cities.size)]
        while (endCity == startCity) {
            endCity = cities[random.nextInt(cities.size)]
        }
        println("Создано направление: $startCity - $endCity")

        println()
        println("Шаг 2 - Продать билеты")
        val passengers = random.nextInt(5, 202)
        println("Продано билетов: $passengers")

        println()
        println("Шаг 3 - Сформировать поезд")
        val train = mutableListOf<Int>()
        var trainCapacity = 0
        var wagonCapacity = 0
        while (trainCapacity < passengers) {
            wagonCapacity = random.nextInt(5, 26)
            train.add(wagonCapacity)
            trainCapacity += wagonCapacity
        }
        println("Сформирован поезд: $train")

        println()
        println("Шаг 4 - Отправить поезд")
        println("Поезд: $startCity - $endCity, состоящий из ${train.size} вагонов отправлен.\r\n" +
                "Вместимость каждого вагона и количестве пассажиров в каждом вагоне: " +
                "$train ")
        println()
        println("Нажмите любую кнопку для создания нового поезда")
        println("Введите EXIT для завершения программы")
        if(readln().uppercase() == "EXIT"){
            return
        }
    }
}

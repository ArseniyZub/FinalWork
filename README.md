# FinalWork
1. Используя команду cat, в терминале операционной системы Linux создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными (заполнив файл лошадьми, верблюдами и ослами), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
   
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/b9a0a1c7-8800-4543-b0f9-fab958943adf)
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/a6a9927d-d425-4428-82a9-9ee269e15997)

3. Создать директорию, переместить файл туда.
   
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/19fb671f-da8a-4679-8eab-804fdbe2589f)

5. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb

sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb

7. Установить и удалить deb-пакет с помощью dpkg.
sudo dpkg - i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb

sudo dpkg -r mysql-connector-j

sudo apt-get autoremove

9. Выложить историю команд в терминале ubuntu.
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/fcb285bb-aa5a-4f5b-b214-43c2170f0208)
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/882e2e22-40ad-4866-8699-4fbf79b6b958)

10. Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: лошади, верблюды и ослы).
   ![class_diagram](https://github.com/ArseniyZub/FinalWork/assets/96389438/4a97caa3-2447-42ae-bf7c-b7cf97563e21)
11. В подключенном MySQL репозитории создать базу данных "Друзья человека"
12. Создать таблицы с иерархией из диаграммы в БД.
13. Заполнить низкоуровневые таблицы именами (животных), командами, которые они выполняют, и датами рождения.
14. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку, объединить таблицы лошади и ослы в одну таблицу.
15. Создать новую таблицу “молодые животные”, в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице.
16. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
    Файл file.sql
13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
14.1 Завести новое животное
14.2 определять животное в правильный класс
14.3 увидеть список команд, которое выполняет животное
14.4 обучить животное новым командам
14.5 Реализовать навигацию по меню
15.Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.


# FinalWork
1. Используя команду cat, в терминале операционной системы Linux создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными (заполнив файл лошадьми, верблюдами и ослами), а затем объединить их. Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека).
cat > Pets 
cat > PackAnimals 
cat PackAnimals Pets > humanFriends 
cat humanFriends 
mv humanFriends humanFriends2 

2. Создать директорию, переместить файл туда.
mkdir test 
mv humanFriends2 test/

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
sudo nano /etc/apt/sources.list.d/mysql.list
  deb http://repo.mysql.com/apt/ubuntu/ focal main
sudo apt update
sudo apt install mysql-server

4. Установить и удалить deb-пакет с помощью dpkg.
sudo dpkg - i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb
sudo dpkg -r mysql-connector-j
sudo apt-get autoremove

5. Выложить историю команд в терминале ubuntu.
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/fcb285bb-aa5a-4f5b-b214-43c2170f0208)
![image](https://github.com/ArseniyZub/FinalWork/assets/96389438/882e2e22-40ad-4866-8699-4fbf79b6b958)



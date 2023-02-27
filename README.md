# Homework_java #

## Task1 ##
*Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*
## Task2 ##
*Вывести все простые числа от 1 до 1000*
## Task3 ##
*Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4*
# #
# Homework_java2 #
## Task1 ##
*В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. 
Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.*
## Task2 ##
*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*
## Task3 ##
*В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*
# #
# Homework_java3 #
## Task_1 ##
*Реализовать алгоритм сортировки слиянием.*
## Task_2 ##
*Пусть дан произвольный список целых чисел. Удалить из него чётные числа.*
## Task3 ##
*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.*
# #
# Homework_java4 #
## Task_1 ##
*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*
## Task_2 ##
*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.*
## Task3 ##
*В калькулятор добавьте возможность отменить последнюю операцию.*
# #
# Less1 #

## hello.java ##
## Task1 ##
*Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”*
## Task2 ##
*Дан массив двоичных чисел, например [1,1,0,1,1,1], 
 вывести максимальное количество подряд идущих 1*
## Task3 ##
*Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива 
должны быть отличны от заданного, а остальные - равны ему*
# #
# Less2 #
## Task1 ##
*Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1*
## Task2 ##
*Напишите метод, который принимает на вход строку (String) и определяет 
является ли строка палиндромом (возвращает boolean значение)*
## Task3 ##
*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения*
## Task4 ##
*Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида*
* 1 Расширение файла: txt
* 2 Расширение файла: pdf
* 3 Расширение файла: 
* 4 Расширение файла: jpg
## Task31 ##
*Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения(вариант 2)*
# #
# Less3 #
## Task1 ##
*Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.*
## Task2 ##
*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке.*
## Task3 ##
*Создать список типа ArrayList < String >.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.*
# #
# Less4 #
## Task0 ##
*Создать ArrayList и LinkedList, вычислить сколько времени уходит на заполнение кажого*
## Task1 ##
*Реализовать консольное приложение, которое:
Принимает от пользователя строку вида 
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.*

## Task2 ##
*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.*
# #
# Less5 #
## Task0 ##
*Cоздать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.Вывести данные по сотрудникам с фамилией Иванов.*
* 123456 Иванов
* 321456 Васильев
* 234561 Петрова
* 234432 Иванов
* 654321 Петрова
* 345678 Иванов.

## Task1 ##
*Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)*
* Пример 1:
* Input: s = "foo", t = "bar"
* Output: false
* Пример 2:
* Input: s = "paper", t = "title"
* Output: true

## Zadacha2 ##
*Написать программу, определяющую правильность расстановки скобок в выражении.*
* Пример 1: a+(d*3) - истина
* Пример 2: [a+(1*3) - ложь
* Пример 3: [6+(3*3)] - истина
* Пример 4: {a}[+]{(d*3)} - истина
* Пример 5: <{a}+{(d*3)}> - истина
* Пример 6: {a+]}{(d*3)} - ложь
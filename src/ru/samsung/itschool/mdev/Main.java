package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /*
         Деревья - структура данных в виде (граф)
         Корень дерева - самый верхний узел
         Ребро дерева - связь между узлами
         Потомок (ребенок) - узел, имеет родителя
         Родитель - узел, имеющий потомков
         Лисm - узел, у которых нет потомков
         Высота дерева - длина самого длинного пути к листу
         Глубина листа - длина пути к корню

         В Java: TreeSet - множество (упорядоченное)
                 TreeMap - словарь (ключ - значение) - упорядочено но по ключу

          Бинарное дерево (двоичное)  - это дерево, в котором для каждого узла не более 2 детей
          Полное бинарное дерево - у каждого узла = 2 потомка
          Сбалансированное бинарное дерево - когда для каждой вершины поддеревьев высота не более 1

         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i=0; i<10000;i++) {
            arrayList.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for(int i=0;i<10000;i++) {
            arrayList.contains(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList: "+(end-start));

        start = System.nanoTime();
        for(int i=0;i<10000;i++) {
            treeSet.contains(i);
        }
        end = System.nanoTime();
        System.out.println("TreeSet:   "+(end-start));


        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Ivan",5));
        students.add(new Student("Petr",3));
        students.add(new Student("Olga",4));
        students.add(new Student("Maria",2));
        students.add(new Student("Alex",1));


        for(Student s: students) {
            System.out.println(s);
        }

        int mark = 3;

     //   students.headSet();
     //   students.tailSet();
     //   students.subSet();

        SortedSet<Student> result =  students.tailSet(new Student("",mark));
        System.out.println(result);







        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("234234");
        arrayList1.add(new Object());
        arrayList1.add(5);


      //  int x = (int)arrayList1.get(0);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("234234");

        Animal<String> cat = new Animal<>();
        cat.setName("Barsik");

        Animal<Integer> cow = new Animal<>();
        cow.setName(768678768);


    }
}

// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;

public class zadacha1 {

    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : list) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }

        System.out.println("linkList = " + linkList);
       
    }
}
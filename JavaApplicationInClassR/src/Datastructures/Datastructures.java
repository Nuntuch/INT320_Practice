/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructures;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class Datastructures {

    public static void main(String[] args) {
        int data[] = {9, 15, 32, 71, 78, 92, 101, 115, 117, 126, 129, 270, 350, 470, 500};
        int pos = binarySearch(data, 128);
        System.out.println("posittion: " + pos);

        pos = binarySearch(data, 117);
        System.out.println("posittion: " + pos);
    }

    private static int binarySearch(int[] data, int key) {
        int position = -1;
        int left = 0;
        int right = data.length - 1;
        int mid = 0;
        while (right >= left) {
//            mid = (right + left) / 2;
            mid = (right + left) >>> 1;
//            int value = data[mid];
//            if (key > value) {
            if (key > data[mid]) {
                left = mid + 1;
//            } else if (key < value) {
            } else if (key < data[mid]) {
                right = mid - 1;
            } else if (key == data[mid]) {
                position = mid;
                break;
            }
//            } else {
//                position = mid;
//                break;
//            }
        }

        return position;
    }

    private static int binarySearch(Comparable[] data, Comparable key) {
        int position = -1;

        return position;
    }

}

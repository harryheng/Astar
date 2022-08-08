package com.example.demo.a.test;

import com.example.demo.a.*;

/**
 * @author work15
 */
public class Test {

    public static void main(String[] args) {
        int[][] maps = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}
        };
        MapInfo info = new MapInfo(maps, maps[0].length, maps.length, new Node(1, 1), new Node(4, 5));
        new AStar().start(info);
        printMap(maps);
    }

    /**
     * 打印地图
     */
    public static void printMap(int[][] maps) {
        for (int[] map : maps) {
            for (int i : map) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}

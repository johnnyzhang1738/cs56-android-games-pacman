package com.example.jimmyle.pacmanandroid;

/**
 * Created by colerogers on 7/10/16.
 * This class is for creating maps for each level
 * A map is a double-dimensional short array with the values corresponding to
 * walls and the gold pellets
 *
 * 1->left wall
 * 2->top wall
 * 4->right wall
 * 8->bottom wall
 * 16->pellet
 *
 * The numbers can be added together to form an area with walls and a pellet,
 * such as the number 19 which would mean a square with top and left walls with a pellet(1+2+16)
 *
 * The map is a 18 width by 17 height double-d array.
 */
public class LevelGenerator {

    //empty constructor since we use the static methods to generate map
    public LevelGenerator(){
    }

    //Static method to return a map with 0 for testing and 1 onward for the actual levels
    public static short[][] getMap(int level){
        switch (level){
            case(0):
                return getTestMap();
            case(1):
                return getLevel1();
            default:
                return getLevel1();
        }
    }

    //Map that has all pellets removed except for one
    private static short[][] getTestMap(){
        return new short[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {3, 10, 10, 2, 10, 10, 10, 6, 0,3, 10,10,10,2,10,10, 6},
                {5, 0, 0, 5, 0, 0, 0, 5, 0, 5, 0, 0, 0, 5, 0, 0, 5},
                {1,10,10, 0,10,2,10, 8,10, 8,10,2,10, 0,10,10, 4},
                {9,10,10, 4, 0, 9,10, 6, 0,3,10, 12, 0, 1,10,10, 12},
                {0, 0, 0, 5, 0, 0, 0, 5, 0, 5, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 5, 0,3,10, 8,10, 8,10, 6, 0, 5, 0, 0, 0},
                {10,10,10, 0,10, 4, 0, 0, 0, 0, 0, 1,10, 0,10,10,10},
                {0, 0, 0, 5, 0, 1,10,10,10,10,10, 4, 0, 5, 0, 0, 0},
                {0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0},
                {3,10,10, 0,10, 8,10, 6, 0,3,10, 8,10, 0,10,10, 6},
                {5, 0, 0, 5, 0, 0, 0, 5, 0, 5, 0, 0, 0, 5, 0, 0, 5},
                {9, 6, 0, 5, 0, 0, 0, 1, 2, 20, 0, 0, 0, 5, 0,3, 12}, // "2" in this line is for
                {0, 5, 0, 1,10,10,2, 8, 8, 8,2,10,10, 4, 0, 5, 0}, // pacman's spawn
                {3, 8,10, 12, 0, 0, 9,2,10,2, 12, 0, 0, 9, 10, 8, 6},
                {5, 0, 0, 0, 0, 0, 0, 5, 0, 5, 0, 0, 0, 0, 0, 0, 5},
                {9,10,10,10,10,10,10, 8,10, 8,10,10,10,10,10,10, 12},
        };
    }

    //Map that is the first level of the game, all spots have pellets
    private static short[][] getLevel1(){
        return new short[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {19, 26, 26, 18, 26, 26, 26, 22, 0, 19, 26, 26, 26, 18, 26, 26, 22},
                {21, 0, 0, 21, 0, 0, 0, 21, 0, 21, 0, 0, 0, 21, 0, 0, 21},
                {17, 26, 26, 16, 26, 18, 26, 24, 26, 24, 26, 18, 26, 16, 26, 26, 20},
                {25, 26, 26, 20, 0, 25, 26, 22, 0, 19, 26, 28, 0, 17, 26, 26, 28},
                {0, 0, 0, 21, 0, 0, 0, 21, 0, 21, 0, 0, 0, 21, 0, 0, 0},
                {0, 0, 0, 21, 0, 19, 26, 24, 26, 24, 26, 22, 0, 21, 0, 0, 0},
                {26, 26, 26, 16, 26, 20, 0, 0, 0, 0, 0, 17, 26, 16, 26, 26, 26},
                {0, 0, 0, 21, 0, 17, 26, 26, 26, 26, 26, 20, 0, 21, 0, 0, 0},
                {0, 0, 0, 21, 0, 21, 0, 0, 0, 0, 0, 21, 0, 21, 0, 0, 0},
                {19, 26, 26, 16, 26, 24, 26, 22, 0, 19, 26, 24, 26, 16, 26, 26, 22},
                {21, 0, 0, 21, 0, 0, 0, 21, 0, 21, 0, 0, 0, 21, 0, 0, 21},
                {25, 22, 0, 21, 0, 0, 0, 17, 2, 20, 0, 0, 0, 21, 0, 19, 28}, // "2" in this line is for
                {0, 21, 0, 17, 26, 26, 18, 24, 24, 24, 18, 26, 26, 20, 0, 21, 0}, // pacman's spawn
                {19, 24, 26, 28, 0, 0, 25, 18, 26, 18, 28, 0, 0, 25, 26, 24, 22},
                {21, 0, 0, 0, 0, 0, 0, 21, 0, 21, 0, 0, 0, 0, 0, 0, 21},
                {25, 26, 26, 26, 26, 26, 26, 24, 26, 24, 26, 26, 26, 26, 26, 26, 28},
        };
    }
}

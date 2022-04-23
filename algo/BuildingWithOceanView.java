package dp;

import java.util.Arrays;

/**
 * 1762. Buildings With an Ocean View
 * There are n buildings in a line. You are given an integer array heights of size n that represents the heights of the buildings in the line.
 *
 * The ocean is to the right of the buildings. A building has an ocean view if the building can see the ocean without obstructions. Formally, a building has an ocean view if all the buildings to its right have a smaller height.
 *
 * Return a list of indices (0-indexed) of buildings that have an ocean view, sorted in increasing order.
 */
public class BuildingWithOceanView {
    public static void main(String[] args) {
        int[] input = {2,2,2,2};
        int maxHeight=input[input.length-1];

        int[] buildingIndex = new int[input.length];
        buildingIndex[0] = input.length-1;

        for(int i=input.length-2; i>=0; i--) {
            if(input[i] > maxHeight) {
                maxHeight = input[i];
                buildingIndex[input.length-1 - i] = i;
            }
        }

        for (int index : buildingIndex) {
            System.out.println(index);
        }
    }
}

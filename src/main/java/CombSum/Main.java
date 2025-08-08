package CombSum;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of candidates: ");
        int size = input.nextInt();
        int[] candidates = new int[size];

        System.out.print("Enter " + size + " candidates");
        for(int i = 0; i<size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            candidates[i] = input.nextInt();
        }

        System.out.print("Enter target number: ");
        int target = input.nextInt();

        System.out.print(CombSumService.combinationSum2(candidates, target));
    }
}

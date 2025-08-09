package CombSum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombSumService {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int start,
                           List<Integer> tmp, List<List<Integer>> result) {
        if (target < 0)
            return;
        else if (target == 0)
            result.add(new ArrayList<>(tmp));
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1])
                    continue;
                tmp.add(candidates[i]);
                backtrack(candidates, target - candidates[i], i + 1, tmp, result);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}

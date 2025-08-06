package day1;

import java.util.*;

public class TeamAssignment {
    static List<List<Integer>> resultTeams = new ArrayList<>();
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] players = {10, 20, 30, 40};
        int totalPlayers = players.length;
        int totalSum = Arrays.stream(players).sum();
        backtrack(players, 0, new ArrayList<>(), 0, totalSum, totalPlayers / 2);
        System.out.println("Team A: " + resultTeams.get(0));
        System.out.println("Team B: " + resultTeams.get(1));
    }

    static void backtrack(int[] players, int index, List<Integer> teamA, int sumA, int totalSum, int targetSize) {
        if (teamA.size() == targetSize) {
            List<Integer> teamB = new ArrayList<>();
            int i = 0;
            for (int val : players) {
                if (!teamA.contains(val) || Collections.frequency(teamA, val) < Collections.frequency(Arrays.asList(Arrays.stream(players).boxed().toArray(Integer[]::new)), val)) {
                    teamB.add(val);
                    i++;
                }
            }
            int sumB = totalSum - sumA;
            int diff = Math.abs(sumA - sumB);
            if (diff < minDiff) {
                minDiff = diff;
                resultTeams.clear();
                resultTeams.add(new ArrayList<>(teamA));
                resultTeams.add(new ArrayList<>(teamB));
            }
            return;
        }
        if (index >= players.length) return;
        teamA.add(players[index]);
        backtrack(players, index + 1, teamA, sumA + players[index], totalSum, targetSize);
        teamA.remove(teamA.size() - 1);
        backtrack(players, index + 1, teamA, sumA, totalSum, targetSize);
    }
}

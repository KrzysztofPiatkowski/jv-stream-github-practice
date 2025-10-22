package practice;

import model.Candidate;

import java.util.function.Predicate;

public class CandidateValidator implements Predicate<Candidate> {
    public boolean test(Candidate candidate) {
        String[] years = candidate.getPeriodsInUkr().split("-");
        int start = Integer.parseInt(years[0]);
        int end = Integer.parseInt(years[1]);

        return candidate.getAge() > 35 && candidate.isAllowedToVote()
            && candidate.getNationality().equals("Ukrainian")
            && (end - start) >= 10;
    }
}

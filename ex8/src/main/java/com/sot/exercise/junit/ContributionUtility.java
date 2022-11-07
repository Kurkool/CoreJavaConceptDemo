package com.sot.exercise.junit;

import java.util.ArrayList;
import java.util.List;

public class ContributionUtility {

    private List<Contribution> contributionList = new ArrayList<Contribution>();

    public List<Contribution> getContributionList() {
        return contributionList;
    }

    public void addContribution(Contribution contribution) {
        if (contribution != null) {
            contributionList.add(contribution);
        }
    }

    public void updateContribution(String date, Contribution contribution) {

        if (!contributionList.isEmpty() && date != null) {

            for (Contribution contrib : contributionList) {
                if (date.equals(contrib.getContributionDate())) {
                    contrib.setContributionAmount(contribution.getContributionAmount());
                    contrib.setContributionDate(contribution.getContributionDate());
                }
            }
        }
    }
}

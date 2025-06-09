package org.codewith3h.finmateapplication.mapper;

import javax.annotation.processing.Generated;
import org.codewith3h.finmateapplication.dto.request.CreateGoalContributionRequest;
import org.codewith3h.finmateapplication.dto.response.GoalContributionResponse;
import org.codewith3h.finmateapplication.entity.Goal;
import org.codewith3h.finmateapplication.entity.GoalContribution;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T08:26:08+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class GoalContributionMapperImpl implements GoalContributionMapper {

    @Override
    public GoalContributionResponse toGoalContributionResponse(GoalContribution goalContribution) {
        if ( goalContribution == null ) {
            return null;
        }

        GoalContributionResponse goalContributionResponse = new GoalContributionResponse();

        goalContributionResponse.setGoalId( goalContributionGoalId( goalContribution ) );
        goalContributionResponse.setAmount( goalContribution.getAmount() );
        goalContributionResponse.setNote( goalContribution.getNote() );
        goalContributionResponse.setContributionDate( goalContribution.getContributionDate() );
        goalContributionResponse.setCreatedAt( goalContribution.getCreatedAt() );

        return goalContributionResponse;
    }

    @Override
    public GoalContribution toGoalContribution(CreateGoalContributionRequest createGoalContributionRequest) {
        if ( createGoalContributionRequest == null ) {
            return null;
        }

        GoalContribution goalContribution = new GoalContribution();

        goalContribution.setGoal( createGoalContributionRequestToGoal( createGoalContributionRequest ) );
        goalContribution.setAmount( createGoalContributionRequest.getAmount() );
        goalContribution.setNote( createGoalContributionRequest.getNote() );
        goalContribution.setContributionDate( createGoalContributionRequest.getContributionDate() );

        return goalContribution;
    }

    private Integer goalContributionGoalId(GoalContribution goalContribution) {
        Goal goal = goalContribution.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getId();
    }

    protected Goal createGoalContributionRequestToGoal(CreateGoalContributionRequest createGoalContributionRequest) {
        if ( createGoalContributionRequest == null ) {
            return null;
        }

        Goal goal = new Goal();

        goal.setId( createGoalContributionRequest.getGoalId() );

        return goal;
    }
}

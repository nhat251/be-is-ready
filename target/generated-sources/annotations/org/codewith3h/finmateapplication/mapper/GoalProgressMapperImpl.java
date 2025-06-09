package org.codewith3h.finmateapplication.mapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import org.codewith3h.finmateapplication.dto.response.GoalProgressResponse;
import org.codewith3h.finmateapplication.entity.Goal;
import org.codewith3h.finmateapplication.entity.GoalProgress;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T08:08:52+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class GoalProgressMapperImpl implements GoalProgressMapper {

    @Override
    public GoalProgress toGoalProgress(Goal goal) {
        if ( goal == null ) {
            return null;
        }

        GoalProgress goalProgress = new GoalProgress();

        goalProgress.setGoal( goal );
        goalProgress.setAmount( goal.getCurrentAmount() );

        goalProgress.setProgressDate( java.time.LocalDate.now() );
        goalProgress.setPercentage( calculatePercentage(goal) );

        return goalProgress;
    }

    @Override
    public GoalProgressResponse toGoalProgressResponse(GoalProgress goalProgress) {
        if ( goalProgress == null ) {
            return null;
        }

        GoalProgressResponse goalProgressResponse = new GoalProgressResponse();

        goalProgressResponse.setId( goalProgress.getId() );
        goalProgressResponse.setGoalId( goalProgressGoalId( goalProgress ) );
        goalProgressResponse.setName( goalProgressGoalName( goalProgress ) );
        goalProgressResponse.setStatus( goalProgressGoalStatus( goalProgress ) );
        goalProgressResponse.setTargetAmount( goalProgressGoalTargetAmount( goalProgress ) );
        goalProgressResponse.setDeadline( goalProgressGoalDeadline( goalProgress ) );
        goalProgressResponse.setProgressDate( goalProgress.getProgressDate() );
        goalProgressResponse.setAmount( goalProgress.getAmount() );
        goalProgressResponse.setPercentage( goalProgress.getPercentage() );
        goalProgressResponse.setIsLongTerm( goalProgressGoalIsLongTerm( goalProgress ) );

        goalProgressResponse.setTimeRemaining( calculateTimeRemaining(goalProgress.getGoal().getDeadline()) );

        return goalProgressResponse;
    }

    private Integer goalProgressGoalId(GoalProgress goalProgress) {
        Goal goal = goalProgress.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getId();
    }

    private String goalProgressGoalName(GoalProgress goalProgress) {
        Goal goal = goalProgress.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getName();
    }

    private String goalProgressGoalStatus(GoalProgress goalProgress) {
        Goal goal = goalProgress.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getStatus();
    }

    private BigDecimal goalProgressGoalTargetAmount(GoalProgress goalProgress) {
        Goal goal = goalProgress.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getTargetAmount();
    }

    private LocalDate goalProgressGoalDeadline(GoalProgress goalProgress) {
        Goal goal = goalProgress.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getDeadline();
    }

    private Boolean goalProgressGoalIsLongTerm(GoalProgress goalProgress) {
        Goal goal = goalProgress.getGoal();
        if ( goal == null ) {
            return null;
        }
        return goal.getIsLongTerm();
    }
}

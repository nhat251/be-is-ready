package org.codewith3h.finmateapplication.mapper;

import javax.annotation.processing.Generated;
import org.codewith3h.finmateapplication.dto.request.CreateGoalRequest;
import org.codewith3h.finmateapplication.dto.response.GoalResponse;
import org.codewith3h.finmateapplication.entity.Goal;
import org.codewith3h.finmateapplication.entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-09T08:26:08+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class GoalMapperImpl implements GoalMapper {

    @Override
    public Goal toGoal(CreateGoalRequest request) {
        if ( request == null ) {
            return null;
        }

        Goal goal = new Goal();

        goal.setUser( createGoalRequestToUser( request ) );
        goal.setName( request.getName() );
        goal.setDescription( request.getDescription() );
        goal.setTargetAmount( request.getTargetAmount() );
        goal.setCurrentAmount( request.getCurrentAmount() );
        goal.setStartDate( request.getStartDate() );
        goal.setDeadline( request.getDeadline() );
        goal.setIsLongTerm( request.getIsLongTerm() );

        return goal;
    }

    @Override
    public GoalResponse toGoalResponse(Goal goal) {
        if ( goal == null ) {
            return null;
        }

        GoalResponse goalResponse = new GoalResponse();

        goalResponse.setName( goal.getName() );
        goalResponse.setDescription( goal.getDescription() );

        return goalResponse;
    }

    protected User createGoalRequestToUser(CreateGoalRequest createGoalRequest) {
        if ( createGoalRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( createGoalRequest.getUserId() );

        return user;
    }
}

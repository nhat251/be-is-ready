package org.codewith3h.finmateapplication.mapper;

import javax.annotation.processing.Generated;
import org.codewith3h.finmateapplication.dto.request.CreateUserRequest;
import org.codewith3h.finmateapplication.dto.response.UserResponse;
import org.codewith3h.finmateapplication.entity.User;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-07T15:56:24+0700",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(CreateUserRequest createUserRequest) {
        if ( createUserRequest == null ) {
            return null;
        }

        User user = new User();

        user.setName( createUserRequest.getName() );
        user.setEmail( createUserRequest.getEmail() );

        return user;
    }

    @Override
    public UserResponse toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setName( user.getName() );
        userResponse.setEmail( user.getEmail() );

        return userResponse;
    }
}

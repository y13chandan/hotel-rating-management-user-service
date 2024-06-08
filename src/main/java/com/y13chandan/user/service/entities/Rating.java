package com.y13chandan.user.service.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
    private String ratingId;
    private long userId;
    private String hotelId;
    private int rating;
    private String feedback;
}

package com.saritha.movie_catalog_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 import com.saritha.movie_catalog_service.entity.Rating;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRating {
    List<Rating> ratings;
}

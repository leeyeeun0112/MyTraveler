package com.webservice.mytraveler.domain.marker;

import com.webservice.mytraveler.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarkerRepository extends JpaRepository<Posts, Long> {

}

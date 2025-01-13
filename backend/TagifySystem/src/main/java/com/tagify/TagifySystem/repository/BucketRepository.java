package com.tagify.TagifySystem.repository;

import com.tagify.TagifySystem.model.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}

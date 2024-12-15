package com.nicefish.search.repository;

import com.nicefish.search.entity.PostSearchEntity;
import com.nicefish.search.entity.UserSearchEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSearchRepository extends ElasticsearchRepository<UserSearchEntity, String> {
    //TODO:重构这里的代码
    Page<UserSearchEntity> findByUserNameLikeIgnoreCaseOrNickNameLikeIgnoreCaseOrEmailLikeIgnoreCase(
            String userName,
            String nickName,
            String email,
            Pageable pageable
    );
}
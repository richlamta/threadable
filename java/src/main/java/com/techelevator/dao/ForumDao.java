package com.techelevator.dao;

import com.techelevator.model.Forum;

import java.util.List;

public interface ForumDao {

    List<Forum> findFavoriteForumsByUserId(int userId);
    List<Forum> getForumsByLatestCreated();
    Forum createForum(Forum forum);
    Forum getForumById(int forumId);

}

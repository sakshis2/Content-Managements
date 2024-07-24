package com.codewithamar.blog.services;

import com.codewithamar.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto,Integer postId);
	
	void deleteComment(Integer commentId);
}

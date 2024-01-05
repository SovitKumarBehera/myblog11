package com.myblog.myblog11.service.Impl;

import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;//i will not use @Autowired for dependency injection,there is another
                                          //way i.e constructor based dependendecy injection


    public PostServiceImpl(PostRepository postRepository) {//right click ->generate->constructor->ok,this is the
                                                 //the second option instead of using @Autowired we use
                                                 //constructor based dependendecy injection
        this.postRepository = postRepository;
    }




    @Override
    public PostDto createPost(PostDto postDto) {
        //now i cannot push the dto to database so i will create
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedPost=postRepository.save(post);

        PostDto dto=new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());

        return dto;



    }
}

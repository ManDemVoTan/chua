/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Tuan
 */
public class Like {
 private int id;
    private String like;
    private String comment;
    private String post;

    public Like() {
    }

    public Like(int id, String like, String comment, String post) {
        this.id = id;
        this.like = like;
        this.comment = comment;
        this.post = post;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Like{" + "id=" + id + ", like=" + like + ", comment=" + comment + ", post=" + post + '}';
    }
    
}


    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Tuan
 */
public class Comment {
    int id;
  String like;
  String commet;

    public Comment() {
    }

    public Comment(int id, String commet) {
        this.id = id;
        this.commet = commet;
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

    public String getCommet() {
        return commet;
    }

    public void setCommet(String commet) {
        this.commet = commet;
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", like=" + like + ", commet=" + commet + '}';
    }
  
}

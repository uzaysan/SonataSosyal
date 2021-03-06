package com.sonata.socialapp.utils.classes;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.nativead.NativeAd;

import java.io.Serializable;
import java.util.Comparator;

public class ListObject implements Serializable {

    private String type;
    private UnifiedNativeAd ad;

    private Chat chat;

    String decryptedMessage;
    public void setDecryptedMessage(String str){
        this.decryptedMessage = str;
    }

    public String getDecryptedMessage(){
        return decryptedMessage;
    }

    public void setChat(Chat chat){
        this.chat = chat;
    }

    public Chat getChat(){
        return chat;
    }
    public SonataUser getUser() {
        return user;
    }

    public void setUser(SonataUser user) {
        this.user = user;
    }

    private Post post;
    private GroupPost groupPost;
    private Comment comment;
    private SonataUser user;
    private Group group;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UnifiedNativeAd getAd() {
        return ad;
    }

    public void setAd(UnifiedNativeAd ad) {
        this.ad = ad;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public GroupPost getGroupPost() {
        return groupPost;
    }

    public void setGroupPost(GroupPost groupPost) {
        this.groupPost = groupPost;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment post) {
        this.comment = post;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public static class SortByDate implements Comparator<ListObject> {
        public int compare(ListObject a, ListObject b) {
            if(a.getChat() != null && b.getChat() !=null){
                return a.getChat().getLastEdit().after(b.getChat().getLastEdit()) ? -1 : 1;
            }
            else if(a.getChat() == null && b.getChat() !=null){
                return 1;
            }
            else if(a.getChat() != null && b.getChat() ==null){
                return -1;
            }
            return 0;

        }
    }
}

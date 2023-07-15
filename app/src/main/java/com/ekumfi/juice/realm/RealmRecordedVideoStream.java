package com.ekumfi.juice.realm;

import com.ekumfi.juice.constants.Const;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by 2CLearning on 12/16/2017.
 */

public class RealmRecordedVideoStream extends RealmObject implements Comparable<RealmRecordedVideoStream> {

    private int id;
    @PrimaryKey
    private String recordedvideostreamid;
    private String sessionid;
    private String instructorcourseid;
    private String title;
    private String description;
    private String docurl;
    private String url;
    private String wowzalink;
    private String gsmcalllink;
    private String giflink;
    private String thumbnail;
    private int isactive;
    private String created_at;
    private String updated_at;

    public RealmRecordedVideoStream() {

    }

    public RealmRecordedVideoStream(String recordedvideostreamid, String sessionid, String instructorcourseid, String title, String description, String docurl, String url, String wowzalink, String gsmcalllink, String giflink, String thumbnail, int isactive, String created_at, String updated_at) {
        this.recordedvideostreamid = recordedvideostreamid;
        this.sessionid = sessionid;
        this.instructorcourseid = instructorcourseid;
        this.title = title;
        this.description = description;
        this.docurl = docurl;
        this.url = url;
        this.wowzalink = wowzalink;
        this.gsmcalllink = gsmcalllink;
        this.giflink = giflink;
        this.thumbnail = thumbnail;
        this.isactive = isactive;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecordedvideostreamid() {
        return recordedvideostreamid;
    }

    public void setRecordedvideostreamid(String recordedvideostreamid) {
        this.recordedvideostreamid = recordedvideostreamid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getInstructorcourseid() {
        return instructorcourseid;
    }

    public void setInstructorcourseid(String instructorcourseid) {
        this.instructorcourseid = instructorcourseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocurl() {
        return docurl;
    }

    public void setDocurl(String docurl) {
        this.docurl = docurl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWowzalink() {
        return wowzalink;
    }

    public void setWowzalink(String wowzalink) {
        this.wowzalink = wowzalink;
    }

    public String getGsmcalllink() {
        return gsmcalllink;
    }

    public void setGsmcalllink(String gsmcalllink) {
        this.gsmcalllink = gsmcalllink;
    }

    public String getGiflink() {
        return giflink;
    }

    public void setGiflink(String giflink) {
        this.giflink = giflink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getIsactive() {
        return isactive;
    }

    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public int compareTo(RealmRecordedVideoStream realmRecordedVideoStream) {
        try {
            if (Const.dateTimeFormat.parse(created_at).getTime() > Const.dateTimeFormat.parse(realmRecordedVideoStream.getCreated_at()).getTime()) {
                return 1;
            } else if (Const.dateTimeFormat.parse(created_at).getTime() < Const.dateTimeFormat.parse(realmRecordedVideoStream.getCreated_at()).getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}

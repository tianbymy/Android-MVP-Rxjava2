package com.zenglb.framework.retrofit.result;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;


/**
 * just a demo !
 * Created by zenglb on 2017/2/9.
 */
@Entity
public class JokesResult implements Parcelable {
    private String topic;
    private String start_time;
    @Unique
    private String id;

    protected JokesResult(Parcel in) {
        topic = in.readString();
        start_time = in.readString();
        id = in.readString();
    }


    @Generated(hash = 1603233542)
    public JokesResult(String topic, String start_time, String id) {
        this.topic = topic;
        this.start_time = start_time;
        this.id = id;
    }


    @Generated(hash = 939070435)
    public JokesResult() {
    }


    public static final Creator<JokesResult> CREATOR = new Creator<JokesResult>() {
        @Override
        public JokesResult createFromParcel(Parcel in) {
            return new JokesResult(in);
        }

        @Override
        public JokesResult[] newArray(int size) {
            return new JokesResult[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(topic);
        dest.writeString(start_time);
        dest.writeString(id);
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AreuSleepBean{" +
                "topic='" + topic + '\'' +
                ", start_time='" + start_time + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

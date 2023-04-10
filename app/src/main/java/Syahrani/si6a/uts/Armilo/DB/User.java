package Syahrani.si6a.uts.Armilo.DB;

import android.os.Parcel;
import android.os.Parcelable;



public class User implements Percelable {

    private String name;

    private String description;

    public User () {}

    protected User(Parcel in) {
        name = in.readString();
        description = in.readString();
    }

    public void writeToParcel (Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);

    }

    public int describeContens (){
        return 0;

    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}

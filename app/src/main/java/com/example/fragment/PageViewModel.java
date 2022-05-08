package com.example.fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }

    private MutableLiveData<String> mPhone = new MutableLiveData<>();
    public void setPhone(String phone) {
        mPhone.setValue(phone);
    }
    public LiveData<String> getPhone() {
        return mPhone;
    }

    private MutableLiveData<String> mGender = new MutableLiveData<>();
    public void setGender(String gender) {
        mGender.setValue(gender);
    }
    public LiveData<String> getGender() {
        return mGender;
    }
}

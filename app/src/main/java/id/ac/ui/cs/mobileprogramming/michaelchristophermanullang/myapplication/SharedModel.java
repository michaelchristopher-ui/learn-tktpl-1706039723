package id.ac.ui.cs.mobileprogramming.michaelchristophermanullang.myapplication;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class SharedModel {

    @Nullable
    private MutableLiveData<CharSequence> text;
    public SharedModel(){
        text = new MutableLiveData<>();
    }

    public void setText(CharSequence input){
        System.out.println("setText in Model");
        text.setValue(input);
    }

    public MutableLiveData<CharSequence> getText(){
        return text;
    }

}

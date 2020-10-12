package id.ac.ui.cs.mobileprogramming.michaelchristophermanullang.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private SharedModel sharedModel;

    public SharedViewModel(){
        sharedModel = new SharedModel();
    }

    public void setText(CharSequence input) {
        //text.setValue(input) ;
        System.out.println("setText in ViewModel");
        sharedModel.setText(input);
    }

    public LiveData<CharSequence> getText() {
        return sharedModel.getText();
    }
}

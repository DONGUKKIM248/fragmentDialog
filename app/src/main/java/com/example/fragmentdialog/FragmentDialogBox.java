package com.example.fragmentdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class FragmentDialogBox extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        String [] courses = getActivity().getResources().getStringArray(R.array.course);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("카테코리 선택");
        builder.setItems(courses, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "you chose:"+courses[i], Toast.LENGTH_SHORT).show();
            }
        });

        return builder.create();
    }
}

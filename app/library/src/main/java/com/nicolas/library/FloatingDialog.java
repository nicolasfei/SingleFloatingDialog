package com.nicolas.library;

import android.app.Dialog;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FloatingDialog extends Dialog {

    public FloatingDialog(@NonNull Context context) {
        super(context);
    }

    public FloatingDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected FloatingDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}

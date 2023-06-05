package com.example.seatour;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ProfileFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.profile_fragment, container, false);
    }

    /**
     * Example local unit test, which will execute on the development machine (host).
     *
     * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
     */
    public static class ExampleUnitTest {
        @Test
        public void addition_isCorrect() {
            assertEquals(4, 2 + 2);
        }
    }

    public static class ShapeableImageView extends View {
        public ShapeableImageView(Context context) {
            this(context, null);
        }

        public ShapeableImageView(Context context, AttributeSet attrs) {
            this(context, attrs, 0);
        }

        public ShapeableImageView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }
    }
}
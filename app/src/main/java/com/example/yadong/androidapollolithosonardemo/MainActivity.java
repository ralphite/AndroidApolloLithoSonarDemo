package com.example.yadong.androidapollolithosonardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yadong.androidapollolithosonardemo.components.ProjectListSection;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext componentContext = new ComponentContext(this);
        final Component component = RecyclerCollectionComponent
                .create(componentContext)
                .section(ProjectListSection.create(new SectionContext(componentContext)).build())
                .build();

        setContentView(LithoView.create(componentContext, component));
    }
}
